import java.util.Scanner;

public class excercise21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many girls are commig to the party?");
        int numberOfGirls = scanner.nextInt();

        System.out.println("How many guys are commig to the party?");
        int numberOfGuys = scanner.nextInt();

        int total = numberOfGirls + numberOfGuys;

        if (numberOfGirls == 0) {
            System.out.println("Sausage party");
        }
        else if (numberOfGirls == numberOfGuys && total >= 20) {
            System.out.println("The party is excelent!");
        }
        else if (numberOfGirls != numberOfGuys && total >= 20) {
            System.out.println("Quite cool party!");
        }
        else if (total < 20) {
            System.out.println("Average party...");
        }
    }
}
