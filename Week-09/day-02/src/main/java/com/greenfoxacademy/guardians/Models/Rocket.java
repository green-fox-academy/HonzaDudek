package com.greenfoxacademy.guardians.Models;

public class Rocket {

    Integer caliber25;
    Integer caliber30;
    Integer caliber50;
    String shipstatus;
    Boolean ready;

    public Rocket() {
        this.caliber25 = 0;
        this.caliber30 = 0;
        this.caliber50 = 0;
        this.shipstatus = "empty";
        this.ready = false;
    }

    public Integer getCurrentAmmo() {
        return caliber25 + caliber30 + caliber50;
    }

    public void fillShip(String caliber, Integer ammo) {
        int currentTotalAmmo = getCurrentAmmo();
        if ((currentTotalAmmo + ammo) > 12500) {
            switch (caliber) {
                case "25":
                    this.caliber25 += 12500 - currentTotalAmmo;
                    break;
                case "30":
                    this.caliber30 += 12500 - currentTotalAmmo;
                    break;
                default:
                    this.caliber50 += 12500 - currentTotalAmmo;
                    break;
            }
        } else {
            switch (caliber) {
                case "25":
                    this.caliber25 += ammo;
                    break;
                case "30":
                    this.caliber30 += ammo;
                    break;
                default:
                    this.caliber50 += ammo;
                    break;
            }
        }
    }

    public Integer getCaliber25() {
        return caliber25;
    }

    public void setCaliber25(Integer caliber25) {
        this.fillShip("25", caliber25);
        this.caliber25 = caliber25;
    }

    public Integer getCaliber30() {
        return caliber30;
    }

    public void setCaliber30(Integer caliber30) {
        this.fillShip("30", caliber30);
        this.caliber30 = caliber30;
    }

    public Integer getCaliber50() {
        return caliber50;
    }

    public void setCaliber50(Integer caliber50) {
        this.fillShip("50", caliber50);
        this.caliber50 = caliber50;
    }

    public String getShipstatus() {
        return this.shipstatus;
    }

    public void setShipstatus() {
        int currentAmmoAmmount = caliber25 + caliber30 + caliber50;
        double shipStatus = (currentAmmoAmmount/12500.0)*100;
        if ((int)shipStatus == 100) {
            this.setReady(true);
            this.shipstatus = "full";
            return;
        }
        this.shipstatus = (int)((currentAmmoAmmount/12500.0)*100) + "%";
    }

    public Boolean getReady() {
        return ready;
    }

    public void setReady(Boolean ready) {
        this.ready = ready;
    }
}
