import java.util.Scanner;

public class excercise17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide integer 1 ");
        int i1 = scanner.nextInt();

        System.out.println("Please provide integer 2 ");
        int i2 = scanner.nextInt();

        System.out.println("Please provide integer 3 ");
        int i3 = scanner.nextInt();

        System.out.println("Please provide integer 4 ");
        int i4 = scanner.nextInt();

        System.out.println("Please provide integer 5 ");
        int i5 = scanner.nextInt();

        int total = i1 + i2 + i3 + i4 + i5;
        double avarage = total / 5.;

        System.out.println("Total is " + total);
        System.out.println("Average is " + avarage);
    }
}
