package com.greenfoxacademy.springstart;

public class Hellos {
    static String[] COLORS = {"#684747", "#1f843e", "#3157aa", "#998c2c"};
    String color;
    String size;
    String content;

    public Hellos(String content) {
        this.color ="color : " + COLORS[(int)(Math.random() * (3))] + "; ";
        this.size = "font-size : " + (int)(Math.random() * (20-10) + 10) + "px";
        this.content = content;
    }

    public static String[] getCOLORS() {
        return COLORS;
    }

    public static void setCOLORS(String[] COLORS) {
        Hellos.COLORS = COLORS;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
