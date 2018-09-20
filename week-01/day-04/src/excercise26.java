import java.util.Scanner;

public class excercise26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide first number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Please provide second number:");
        int secondNumber = scanner.nextInt();

        if (secondNumber < firstNumber) {
            System.out.println("Second number should be bigger, please provide the second number again:");
            secondNumber = scanner.nextInt();
        }

        for (int i = firstNumber; i < secondNumber; i++) {
            System.out.println(i);
        }
    }
}
