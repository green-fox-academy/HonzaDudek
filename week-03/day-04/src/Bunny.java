import java.util.Scanner;

public class Bunny {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many bunnies does the farmer haave?");
        int numberOfBunnies = scanner.nextInt();
        System.out.println("Farmer has " + numberOfBunnies + " bunnies and they have " + earCounter(numberOfBunnies) + " ears");
    }

    public static int earCounter(int numberOfBunnies) {
        if (numberOfBunnies > 0) {
            return 2 + earCounter(numberOfBunnies - 1);
        }
        else {
            return 0;
        }
    }
}
