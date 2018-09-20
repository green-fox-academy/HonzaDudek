import java.util.Scanner;

public class excercise15 {
    public static void main(String[] args) {
        System.out.println("Please enter distance in kilometers: ");

        Scanner scanner = new Scanner(System.in);
        int distanceInKm = scanner.nextInt();
        double distanceInMiles = distanceInKm * 1.6;

        System.out.println("You entered " + distanceInKm + "km. That is " + distanceInMiles + " miles.");
    }
}
