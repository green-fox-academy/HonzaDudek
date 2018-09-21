import java.util.Scanner;

public class subStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first string:");
        String firstString = scanner.nextLine();

        System.out.println("Please enter seconds string:");
        String secondString = scanner.nextLine();

        if (firstString.toLowerCase().contains(secondString.toLowerCase())) {
            System.out.println(firstString.indexOf(secondString));
        }
        else {
            System.out.println("-1");
        }

    }
}
