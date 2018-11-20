package com.greenfoxacademy.guardians.Models;

public class Yondu {

    Double distance;
    Double speed;
    Double time;

    public Yondu(double distance, double time) {
        this.distance = distance;
        this.speed = distance/time;
        this.time = time;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }
}
