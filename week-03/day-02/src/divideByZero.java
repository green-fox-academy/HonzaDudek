import javafx.scene.transform.Scale;

import java.util.Scanner;

public class divideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, provide a number:");
        int number = scanner.nextInt();
        System.out.println(division(number));
    }

    public static int division(int number) {
        int result = 0;
        try {
            result = 10 / number;
        }
        catch (ArithmeticException e) {
            System.out.println("fail");
        }
        return result;
    }
}
