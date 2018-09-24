public class excercise05 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int factorialNumber) {
        int[] factorial = new int[factorialNumber + 1];

        if (factorialNumber == 0) {
            return 1;
        }
        else {
            int factorialResult = 1;
            for (int i = 1; i <= factorialNumber ; i++) {
                factorial[i] = i;
                factorialResult *= factorial[i];
            }
            return factorialResult;
        }
    }
}
