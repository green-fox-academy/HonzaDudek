public class Pirates {
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
        }
        else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            sleep = true;
        }
    }


}
