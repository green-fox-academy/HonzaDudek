import java.util.ArrayList;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What operation you would like to do, choose from |*|/|+|-|%| and then provide 2 numbers");
        String operation = scanner.next();
        int operand1 = scanner.nextInt();
        int operand2 = scanner.nextInt();

        calculate(operation, operand1, operand2);
    }

    public static void calculate(String operation, int operand1, int operand2) {
        int result = 0;
        if (operation.equals("*")) {
            result = operand1 * operand2;
            System.out.println(result);
        }
        else if (operation.equals("/")) {
            result = operand1 / operand2;
            System.out.println(result);
        }
        else if (operation.equals("+")) {
            result = operand1 + operand2;
            System.out.println(result);
        }
        else if (operation.equals("-")) {
            result = operand1 - operand2;
            System.out.println(result);
        }
        else {
            result = operand1 % operand2;
            System.out.println(result);
        }
    }
}
