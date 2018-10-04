public class BunniesInLine {
    public static void main(String[] args) {
        System.out.println(countOddBunnies(20));
    }

    public static int countOddBunnies(int numberOfBunnies) {
        if (numberOfBunnies > 0) {
            if (numberOfBunnies % 2 != 0) {
                return 3 + countOddBunnies(numberOfBunnies - 1);
            } else {
                return 2 + countOddBunnies(numberOfBunnies - 1);
            }
        } else {
            return 0;
        }
    }
}
