import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Carrier {
    int ammoStorage;
    int health;
    List<Aircraft> newCarrier = new ArrayList<>();
    int name;

    public Carrier(int ammoStorage, int health) {
        this.ammoStorage = ammoStorage;
        this.health = health;
    }

    public void add(String type) {
        if (type.equalsIgnoreCase("f16")) {
            newCarrier.add(new F16());
        }
        else if (type.equalsIgnoreCase("F35")) {
            newCarrier.add(new F35());
        }
    }

    public void addRandom() {
        int numberOfAircrafts = 10;
        for (int i = 0; i < numberOfAircrafts; i++) {
            int random = (int) (1 + (Math.random() * 9));
            if  (random <= 7) {
                newCarrier.add(new F16());
            }
            else {
                newCarrier.add(new F35());
            }
        }
    }

    public void fill() {
        int ammoNeeded = 0;
        for (int i = 0; i < newCarrier.size(); i++) {
            ammoNeeded += newCarrier.get(i).maxAmmunition - newCarrier.get(i).currentAmmo;
        }
        if (ammoNeeded > this.ammoStorage) {
            for (int i = 0; i < newCarrier.size(); i++) {
                if (newCarrier.get(i).isPriority()) {
                    Collections.swap(newCarrier, 0, newCarrier.indexOf(newCarrier.get(i)));
                }
            }
        }
        else {
            for (Aircraft aircraft : newCarrier
            ) {
                aircraft.refill(aircraft.maxAmmunition);
                ammoStorage -= aircraft.maxAmmunition;
            }
        }
        System.out.println("All aircrafts were refilled, the carrier now has " + ammoStorage + " ammunition in its storage");
    }

    public int totalDamage() {
        int totalDamage = 0;
        for (Aircraft aircraft : newCarrier
        ) {
            totalDamage += aircraft.aircraftDamage();
        }
        return totalDamage;
    }

    public void fight(Carrier otherCarrier) {
        this.totalDamage();
        System.out.println("The carrier attacked for " + this.totalDamage());
        otherCarrier.health -= this.totalDamage();
        this.getStatus();
        otherCarrier.getStatus();
        if (this.health <= 0) {
            System.out.println("This carrier is dead");
        }
        if (otherCarrier.health <= 0) {
            System.out.println("Wow, you have destrozed the other carrier");
        }
    }

    public void getStatus() {
        System.out.println("==============================");
        System.out.println("Carrier status:");
        System.out.printf("HP: %d, Aircraft count: %d, Ammo Storage: %d, Total damage: %d \n", this.health, newCarrier.size(), ammoStorage, this.totalDamage());
        System.out.println("Aircrafts:");
        for (Aircraft aircraft : newCarrier
        ) {
            aircraft.getStatus();
        }
        System.out.println("==============================");
    }
}
