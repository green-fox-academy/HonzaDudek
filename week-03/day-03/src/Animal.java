public class Animal {
    int hunger = 50;
    int thirst = 50;

    public Animal() {

    }

    public

    void eat() {
        hunger--;
    }

    void drink() {
        thirst--;
    }

    void play() {
        hunger++;
        thirst++;
    }
}
