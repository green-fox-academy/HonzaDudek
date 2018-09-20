public class Excercise08 {
    public static void main(String[] args) {
        int a = 123;
        int b = 567;
        int temp = a;

        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
