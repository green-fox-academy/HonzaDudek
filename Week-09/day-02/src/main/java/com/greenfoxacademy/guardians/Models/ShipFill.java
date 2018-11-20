package com.greenfoxacademy.guardians.Models;

public class ShipFill{

    String received;
    Integer amount;
    String shipstatus;
    Boolean ready;

    public ShipFill(Rocket rocket, String received, Integer ammount) {
        this.received = received;
        this.amount = ammount;
        this.shipstatus = rocket.getShipstatus();
        this.ready = rocket.getReady();
    }

    public String getReceived() {
        return received;
    }

    public void setReceived(String received) {
        this.received = received;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getShipstatus() {
        return shipstatus;
    }

    public void setShipstatus(String shipstatus) {
        this.shipstatus = shipstatus;
    }

    public Boolean getReady() {
        return ready;
    }

    public void setReady(Boolean ready) {
        this.ready = ready;
    }
}
