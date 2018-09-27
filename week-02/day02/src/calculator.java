import java.util.ArrayList;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What operation you would like to do, choose from |*|/|+|-|%| and then provide 2 nombers");
        String operate = scanner.nextLine();

//        operation.substring(0,1);
//
//        ArrayList<> calculation = new ArrayList();
//
//        calculate(operation, operand1, operand2);
    }

    public static int calculate(String operation, int operand1, int operand2) {
        int result = 0;
        if (operation.equals("*")) {
            result = operand1 * operand2;
            return result;
        }
        else if (operation.equals("/")) {
            result = operand1 / operand2;
            return result;
        }
        else if (operation.equals("+")) {
            result = operand1 + operand2;
            return result;
        }
        else if (operation.equals("-")) {
            result = operand1 - operand2;
            return result;
        }
        else {
            result = operand1 % operand2;
            return result;
        }
    }
}
