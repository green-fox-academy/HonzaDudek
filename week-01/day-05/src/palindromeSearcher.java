import java.util.Scanner;

public class palindromeSearcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        for (int i = 1; i <= input.length() - 1; i++) {
            System.out.print(input.charAt(i - 1));
            System.out.print(input.charAt(i));
            System.out.print(input.charAt(i + 1));

            if (input.charAt(i-1) == input.charAt(i) && input.charAt(i) == input.charAt(i+1))
                System.out.print(input.charAt((i-1)) + input.charAt((i)) + input.charAt((i+1)));
        }
    }
}
