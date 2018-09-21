import java.util.Scanner;

public class excercise16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many chickens does the farmer have?");
        int chickens = scanner.nextInt();
        chickens = chickens * 2;

        System.out.println("How many pigs does the farmer have?");
        int pigs = scanner.nextInt();
        pigs = pigs * 4;

        System.out.println("Animals have " + (pigs + chickens) + " legs.");

    }
}
