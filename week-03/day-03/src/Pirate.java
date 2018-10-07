public class Pirate {
    int drunkeness = 0;
    int life = 100;
    boolean sleep = false;
    String name;
    int rumCount;




    public void drinkSomeRum() {
        rumCount++;
        drunkeness += 5;
    }

    public void howIsItGoinMate() {
        if (rumCount <= 4) {
            System.out.println("Pour me anudder!");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            sleep = true;
        }
    }

    public void die() {
        life = 0;
        System.out.println("He's dead");

    }

    public static void brawl(Pirate pirate1, Pirate pirate2) {
        // Create dice for deciding who starts first and sets value of roll to each pirate
        int dice = 0;
        int pirate1Roll;
        int pirate2Roll;

        // While both pirates are alive...
        while (pirate1.life > 0 || pirate2.life > 0) {

            // Get value of damage for each pirate
            double pirate1Damage = Math.random() * (50 - 10);
            double pirate2Damage = Math.random() * (50 - 10);

            // Get value of each dice roll
            pirate1Roll = (int) (Math.random() * (6 - 1)) + 1;
            pirate2Roll = (int) (Math.random() * (6 - 1)) + 1;

            // If both rolls are the same, re-roll
            while (pirate1Roll == pirate2Roll) {
                pirate1Roll = (int) (Math.random() * (6 - 1)) + 1;
                pirate2Roll = (int) (Math.random() * (6 - 1)) + 1;
            }

            // Comparing the roll value to decide who attacks first
            if (pirate1Roll > pirate2Roll) {
                pirate2.life -= pirate1Damage;
                pirate1.life -= pirate2Damage;
                System.out.println("Pirate 1 attacks first");
                System.out.println("Pirate 1 does damage for " + pirate1Damage + " / Pirate 2 does damage for " + pirate2Damage);
                System.out.println("Pirate 1 life = " + pirate1.life + " / Pirate 2 life is " + pirate2.life);
                System.out.println("=====================");
            } else {
                pirate1.life -= pirate1Damage;
                pirate2.life -= pirate2Damage;
                System.out.println("Pirate 2 attacks first");
                System.out.println("Pirate 2 does damage for " + pirate1Damage + " / Pirate 2 does damage for " + pirate2Damage);
                System.out.println("Pirate 1 life = " + pirate1.life + " / Pirate 2 life is " + pirate2.life);
                System.out.println("=====================");
            }

            // If one of the pirates die, we vreak the loop and end the brawl
            if (pirate1.life < 0 || pirate2.life < 0) {
                if (pirate1.life < 0) {
                    System.out.println("Pirate 2 has won the brawl.");
                    System.out.print("Pirate 1 has lost the brawl. ");
                    pirate1.die();
                    break;
                } else {
                    System.out.println("Pirate 1 has won the brawl.");
                    System.out.print("Pirate 2 has lost the brawl. ");
                    pirate2.die();
                    break;
                }
            }

        }

    }
}
