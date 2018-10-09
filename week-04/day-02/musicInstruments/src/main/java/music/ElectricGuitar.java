package main.java.music;

public class ElectricGuitar extends StringedInstrument {
    String sound = "Twang";
    public ElectricGuitar() {
        this.numberOfStrings = 6;
        this.sound = "Twang";
        this.type = "Electric guitar";
    }

    public ElectricGuitar(int numberOfStrings) {
        super(numberOfStrings);
        this.type = "Electric guitar";
    }

    public String sound() {
        return sound;
    }

}
