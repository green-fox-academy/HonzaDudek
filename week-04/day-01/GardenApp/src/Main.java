import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Garden garden = new Garden();
        Flower yellow = new Flower("yellow");
        Flower blue = new Flower("blue");
        Tree orange = new Tree("orange");
        Tree purple = new Tree("purple");

        garden.add(yellow);
        garden.add(blue);
        garden.add(orange);
        garden.add(purple);

        garden.gardenStatus();

        garden.watering(40);
        garden.watering(70);


    }
}
