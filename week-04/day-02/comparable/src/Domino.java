public class Domino implements Comparable<Domino>, Printable {
    private final int[] values;

    public Domino(int valueA, int valueB) {
        this.values = new int[]{valueA, valueB};
    }

    public int[] getValues() {
        return values;
    }

    @Override
    public String toString() {
        return "[" + values[0] + ", " + values[1] + "]";
    }

    public int compareTo(Domino other) {
        return this.toString().compareTo(other.toString());
    }

    @Override
    public void printAllfields() {
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " " );
        }
        System.out.println();
    }
}