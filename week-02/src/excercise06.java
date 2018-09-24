import java.util.Scanner;

public class excercise06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many parameters you want to have");
        int numberOfParams = scanner.nextInt();

        printParams(numberOfParams);


    }

    public static int[] printParams(int numberOfParams) {

        int[] params = new int[numberOfParams];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numberOfParams; i++) {
            System.out.println("Please provide parameter " + (i + 1) + ":");
            params[i] = scanner.nextInt();
        }
        for (int i = 0; i < numberOfParams; i++) {
            System.out.println(params[i]);
        }

        return params;
    }
}
