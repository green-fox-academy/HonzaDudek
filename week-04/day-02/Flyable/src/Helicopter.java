public class Helicopter extends Vehicle implements Flyable {

    public Helicopter() {
        this.type = "Helicopter";
        this.passangers = 6;
    }

    @Override
    public void fly() {
        System.out.println("The " + this.type + " is flying.");
    }

    @Override
    public void takeOff() {
        this.fuel -= 15;
        System.out.println("The " + this.type + " is taking off.");
    }

    @Override
    public void land() {
        this.fuel -= 5;
        System.out.println("The " + this.type + " is taking off.");
    }
}
