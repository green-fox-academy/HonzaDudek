import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Garden {
    String name;
    ArrayList<Plants> garden = new ArrayList<Plants>(Arrays.asList());

    public Garden() {
    }

    public void gardenStatus() {
        for (Plants plant: garden
             ) {
            if (plant.water < 10) {
                System.out.println("The " + plant.color + " " + plant.type + " needs water");
            }
            else {
                System.out.println("The " + plant.color + " " + plant.type + " does not need water");
            }
        }
        System.out.println();
    }

    public void heat() {
        for (Plants plant: garden
             ) {
            plant.water -= 2;
        }
    }

    public void add(Plants plant) {
        garden.add(plant);
    }

    public void watering(int ammountOfWater) {
        System.out.println("Watering garden with " + ammountOfWater + " water.");
        for (int i = 0; i < garden.size() ; i++) {
            if (garden.get(i) instanceof Flower && garden.get(i).water < 5) {
                garden.get(i).water += ((double)ammountOfWater/garden.size()) * garden.get(i).waterAbsorbtion;
            }
            else if ((garden.get(i) instanceof Tree && garden.get(i).water < 10)) {
                garden.get(i).water += ((double)ammountOfWater/garden.size()) * garden.get(i).waterAbsorbtion;
            }

        }
        this.gardenStatus();
    }
}
