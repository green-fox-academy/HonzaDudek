public class Counter {
    int integer;
    int initialValue;

    public Counter() {
        integer = 0;
        initialValue = 0;
    }

    public Counter(int integer) {

        this.integer = integer;
        this.initialValue = integer;
    }

    public void add() {
        integer++;
    }

    public void add(int number) {

        integer = integer + number;
    }

    public int get() {
        return integer;
    }

    public void reset() {
        integer = initialValue;
    }

}