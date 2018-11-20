package com.greenfoxacademy.guardians.Models;

public class Yondu {

    double distance;
    double speed;
    double time;

    public Yondu(double distance, double time) {
        this.distance = distance;
        this.speed = distance/time;
        this.time = time;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
}
