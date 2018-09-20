import java.util.Scanner;

public class excercise19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide a number:");
        int input = scanner.nextInt();

        if (input < 0) {
            System.out.println("Not enough");
        }
        else if (input == 1) {
            System.out.println("One");
        }
        else if (input == 2) {
            System.out.println("Two");
        }
        else {
            System.out.println("A lot");
        }
    }
}