import java.util.Random;
import java.util.Scanner;

public class excercise33 {
    public static void main(String[] args) {

        // First, I generate random number between 0 and 99
        Random random = new Random();
        int number = random.nextInt(100);

        // I ask useer for their pick and store the pick in guessNumber variable
        System.out.println("Please guess number from 0 to 99:");
        Scanner scanner = new Scanner(System.in);

        int guessedNumber = scanner.nextInt();

        // Check if the user chose number from the right range, if not, user is prompted for new input
        while (guessedNumber < 0 || guessedNumber > 99) {
            System.out.println("Please select number from 0 to 99");
            guessedNumber = scanner.nextInt();
        }

        // Program checks, whether entered number is same as stored random number
        while (guessedNumber != number) {

            // If picked number is lower or higher then stored one, we print a message and prompt for new input
            if (guessedNumber < number) {
                System.out.println("The stored number is higher");
                guessedNumber = scanner.nextInt();
            } else if (guessedNumber > number) {
                System.out.println("The stored number is lower");
                guessedNumber = scanner.nextInt();
            }
        }
        // If user chooses right number winning message is printed and the loop ends
        System.out.println("That is a correct number!!!");
     }
}
