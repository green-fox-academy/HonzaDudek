public class NumberAdder {
    public static void main(String[] args) {
        System.out.println(numberAdder(5));
    }

    public static int numberAdder(int number) {
        if (number >= 1) {
            return number + numberAdder(number - 1);
        }
        else {
            return number;
        }
    }
}
