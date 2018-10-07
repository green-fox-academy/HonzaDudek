import java.util.ArrayList;
import java.util.List;

public class Ship {
    String name;
    List<Pirate> crew = new ArrayList<>();
    Pirate captain = new Pirate();



    public Ship() {

    }

    public List fillShip() {
        Pirate captain = new Pirate();
        crew.add(captain);
        for (int i = 1; i < 5 + (int)(Math.random()*(10-5)) + 1; i++) {
            Pirate pirate = new Pirate();
            crew.add(new Pirate());
            pirate.name = "pirate" + i;
        }
        System.out.println("Ship has now a captain and " + crew.size() + " pirates on board!");
        return crew;
    }

    void shipStatus(Ship ship) {
        int alivePirates = crew.size();
        System.out.println("=============");
        System.out.println("Ship status:");
        System.out.println("Captain has drunk " + captain.rumCount + " rums.");

        for (int i = 0; i < crew.size(); i++) {
            if (crew.get(i).life == 0) {
                alivePirates--;
            }
        }
        System.out.println("There is " + alivePirates + " alive pirates on a ship.");
        System.out.println("=============");
    }

    boolean shipBattle(Ship ship1) {
        boolean weWon = false;
        int scoreOfMyShip = crew.size() - captain.rumCount;
        int scoreOfOtherShip = ship1.crew.size() - ship1.captain.rumCount;
        if (scoreOfMyShip > scoreOfOtherShip) {
            weWon = true;
            for (int i = 0; i < 1 + Math.random()*ship1.crew.size(); i++) {
                ship1.crew.remove(i);
            }
            for (int i = 0; i < Math.random()*5; i++) {
                captain.drinkSomeRum();
                for (Pirate pirate: crew
                     ) {
                    pirate.drinkSomeRum();
                }
            }
           return weWon;
        }
        return weWon;
    }
}
