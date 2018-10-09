package main.java.music;

public class BassGuitar extends StringedInstrument{
    String sound = "Duum-duum-duum";

    public BassGuitar() {
        this.numberOfStrings = 4;
        this.type = "Bass guitar";

    }

    public BassGuitar(int numberOfStrings) {
        super(numberOfStrings);
        this.type = "Bass guitar";

    }

    public String sound() {
        return sound;
    }
}
