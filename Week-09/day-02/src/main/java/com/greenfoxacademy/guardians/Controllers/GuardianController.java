package com.greenfoxacademy.guardians.Controllers;


import com.greenfoxacademy.guardians.Models.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

    Rocket ship = new Rocket();

    @GetMapping(value = "/groot")
    public Object translateToGroot(@RequestParam(value = "message", required = false) String received) {
        if (received != null) {
            return new Groot(received);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Errors("I am Groot!"));
        }
    }

    @GetMapping(value = "/yondu")
    public Object calculateYondusSpeed(@RequestParam(value = "distance", required = false) Double distance,
                                       @RequestParam(value = "time", required = false) Double time) {
        if (distance != null && time != null) {
            return new Yondu(distance, time);
        } else if (distance == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Errors("You have to provide distance"));
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Errors("You have to provide time"));
        }
    }

    @GetMapping(value = "/rocket")
    public Object returnShipStatus() {
        return ship;
    }

    @GetMapping(value = "/rocket/fill")
    public Object returnShipStatus(@RequestParam(value = "caliber", required = false) String caliber,
                                   @RequestParam(value = "amount", required = false) Integer amount) {
        if (caliber != null && amount != null) {
            ship.fillShip(caliber.substring(1,3), amount);
            ship.setShipstatus();
            return new ShipFill(ship, caliber, amount);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Errors("Specify the caliber and amount of ammo to re-fill"));
        }

    }
}
