import java.util.Scanner;

public class excercise20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide first number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Please provide second number:");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " is greater number.");
        }
        else if (firstNumber < secondNumber){
            System.out.println(secondNumber + " is greater number.");
        }
        else {
            System.out.println("Those are equal numbers.");
        }
    }
}
