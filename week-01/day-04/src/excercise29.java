import java.util.Scanner;

public class excercise29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many floors should the pyramid have?");
        int numberOfLines = scanner.nextInt();
        String star = "*";
        String space = " ";

        for (int level = 0; level < numberOfLines; level++) {
            for (int numberofSpaces = numberOfLines - level; numberofSpaces > 0; numberofSpaces--) {
                System.out.print(space);
            }
            for (int numberOfStars = 0; numberOfStars < level; numberOfStars++) {
                System.out.print(star + star);
            }
            System.out.println(star);
        }
    }
}
