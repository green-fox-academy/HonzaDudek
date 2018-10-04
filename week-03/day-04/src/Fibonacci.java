public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(9));
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else {
            System.out.print(fibonacci(n - 1) + " ");
            System.out.print(fibonacci(n - 2));
            System.out.println();
            return fibonacci(n-1) + fibonacci(n - 2);
        }
    }
}
