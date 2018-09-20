import java.util.Scanner;

public class excercise18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide a number:");
        int input = scanner.nextInt();

        if (input % 2 == 0) {
            System.out.println("This is even number.");
        }
        else {
            System.out.println("This is odd number.");
        }
    }
}
