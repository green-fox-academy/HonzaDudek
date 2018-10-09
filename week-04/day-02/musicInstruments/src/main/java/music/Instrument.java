package main.java.music;

public abstract class Instrument {
    protected String name;
    protected String sound;
    protected String type;

    public Instrument() {

    }

    public Instrument(String instrumentName) {
        this.name = instrumentName;
    }

    public abstract void play();


}
