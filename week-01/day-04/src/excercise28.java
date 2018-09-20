import java.util.Scanner;

public class excercise28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, specify the number of lines you want to display:");
        int numberOfLines = scanner.nextInt();
        String star = "*";

        for (int i = 0; i < numberOfLines; i++) {
            System.out.println(star);
            star = star + "*";
        }
    }
}
