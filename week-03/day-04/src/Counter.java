public class Counter {
    public static void main(String[] args) {
        factorialWithRecursion(5);
        System.out.println("===============");
        counterToN(5);
    }

    public static int factorialWithRecursion(int n) {
        if (n == 1) {
            return 1;
        } else {
            System.out.print(n + ", " +  (n-1));
            System.out.println();
            return n * factorialWithRecursion(n - 1);
        }
    }

    public static int counterToN(int number) {
        if (number == 0) {
            return 0;
        }
        else {
            System.out.println(number + ", " +(number-1));
            return number + counterToN(number-1)  ;
        }
    }
}
