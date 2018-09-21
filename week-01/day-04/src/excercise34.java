import java.util.Scanner;

public class excercise34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer:");
        // Program asks for base integer
        int baseNumber = scanner.nextInt();

        // I initialize an sum variable, that I use in loop for storing the sum
        int sum = 0;

        // Loop runs for as many times as user suggested
        for (int i = 0; i < baseNumber; i++) {
            System.out.println("Please enter an integer:");
            int average1 = scanner.nextInt();
            sum += average1;
        }
        System.out.println();
        System.out.println("Sum is: " + sum);
        System.out.println("Average is: " + (sum / baseNumber));
    }
}
