package main.java.music;

public class Violin extends StringedInstrument {
    public Violin() {
        this.numberOfStrings = 4;
        this.sound = "Screech";
        this.type = "Violin";

    }

    public Violin(int numberOfStrings) {
        super(numberOfStrings);
    }

    public String sound() {
        return sound;
    }
}
