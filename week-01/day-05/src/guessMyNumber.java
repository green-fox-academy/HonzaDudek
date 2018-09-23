import java.util.Scanner;

public class guessMyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Program asks for lower number
        System.out.println("Please provide starting number (low)");
        int startingNumber = scanner.nextInt();

        // Program asks for higher number
        System.out.println("Please provide last number (high)");
        int lastNumber = scanner.nextInt();

        // If user added number in wrong order, program sorts them so the range makes sense
        if (lastNumber < startingNumber) {
            int temp;
            temp = lastNumber;
            lastNumber = startingNumber;
            startingNumber = temp;
        }

        // Program intializes random function with given range
        int range = (lastNumber - startingNumber) +1;
        int randomNumber = (int)(Math.random() * range) + startingNumber;

        // Program sets starting and current number of lives
        int startingLives = 5;
        int lives = startingLives;

        // User is propted for his guess
        System.out.println("Please choose number between " + startingNumber + " and " + lastNumber);
        int guessedNumber = scanner.nextInt();

        // While lives ar higher than 0, program compares the guessed number with the random one
        while (lives > 0) {

            if (guessedNumber < startingNumber || guessedNumber > lastNumber) {
                System.out.println("Please choose number from " + startingNumber + " to " + lastNumber);
                guessedNumber = scanner.nextInt();
            }
            else if (guessedNumber == randomNumber) {
                System.out.println("Congratulations, you have won with "+ lives + " lives left!!!");
                break;
            }
            else if (guessedNumber < randomNumber) {
                lives -= 1;
                System.out.println("Too low, please choose higher number. You have " + lives + " left.");
                guessedNumber = scanner.nextInt();
            }
            else {
                lives -= 1;
                System.out.println("Too high, please choose higher number. You have " + lives + " left.");
                guessedNumber = scanner.nextInt();
            }

            if (lives == 0) {
                System.out.println("Sorry, you have't picked a right number and lost all your lives");
                break;
            }
        }
    }
}
