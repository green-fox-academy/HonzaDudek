public class Counter {
    int integer;

    public Counter() {
        integer = 0;
    }

    public Counter(int integer) {
        this.integer = integer;
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
        integer = this.integer;
    }

}