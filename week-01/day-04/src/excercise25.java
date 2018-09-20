import java.util.Scanner;

public class excercise25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please provide a number you would like to multiply: ");
        int number = scanner.nextInt();

        for (int i = 0; i < 20; i++) {
            System.out.println(i + " * " + number + " = " + i * number);
        }
    }
}
