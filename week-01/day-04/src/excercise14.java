import java.util.Scanner;

public class excercise14 {
    public static void main(String[] args) {
        System.out.println("Please enter your name: ");

        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();

        System.out.println("Hello, " + username + "!");
    }
}
