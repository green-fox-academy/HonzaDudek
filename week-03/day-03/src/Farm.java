import java.util.ArrayList;
import java.util.List;

public class Farm {

    int numberOfSlots = 3;
    List<Animal> listOfAnimals = new ArrayList<>(numberOfSlots);


    public void breed() {
        if (listOfAnimals.size() < numberOfSlots) {
            Animal newAnimal = new Animal();
            listOfAnimals.add(newAnimal);
        }
        else {
            System.out.println("There is no place for more animals");
        }
    }

    public void slaughter() {
        int hungerOfAnimal = 0;
        Animal animalToSlaughter = null;
        animalToSlaughter = listOfAnimals.get(0);
        for (int i = 0; i < listOfAnimals.size(); i++) {
            hungerOfAnimal = listOfAnimals.get(i).hunger;
            if (hungerOfAnimal < animalToSlaughter.hunger) {
                animalToSlaughter = listOfAnimals.get(i);
            }
        }
        listOfAnimals.remove(animalToSlaughter);
    }
}
