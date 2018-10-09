package main.java.music;

public abstract class StringedInstrument extends Instrument {
    int numberOfStrings;

    public StringedInstrument() {
        System.out.println("");
    }

    public StringedInstrument(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public abstract String sound();

    public void play(){
        System.out.println(this.type + ", a " + this.numberOfStrings + "-stringed instrument goes " + sound());
    }

}
