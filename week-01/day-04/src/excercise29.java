import java.util.Scanner;

public class excercise29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many floors should the pyramid have?");
        int numberOfLines = scanner.nextInt();
        String star = "*";
        String space = " ";
        StringBuilder str = new StringBuilder(star);

        for (int i = 0; i < numberOfLines; i++) {
            for (int j = numberOfLines - i; j > 0; j--) {
                System.out.print(space);
            }
            for (int k = 0; k < i; k++) {
                System.out.print(star + star);
            }
            System.out.println(star);
        }
    }
}
