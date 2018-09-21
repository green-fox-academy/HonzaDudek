import java.util.Scanner;

public class excercise30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many lines should the diamond have?");
        int numberOfLines = scanner.nextInt();
        String star = "*";
        String space = " ";

        for (int level = 0; level < numberOfLines; level++) {
            if (numberOfLines / (level + 1) >= 2) {
                for (int numberOfSpaces = (numberOfLines - level); numberOfSpaces > 0; numberOfSpaces--) {
                    System.out.print(space);
                }
                for (int numberOfStars = 0; numberOfStars < level; numberOfStars++) {
                    System.out.print(star + star);
                }
                System.out.println(star);
            }

            else {
                for (int numberOfSpaces = 0; numberOfSpaces < numberOfLines - 1; numberOfSpaces++) {
                    System.out.print(space);
                }
                for (int numberOfStars = 0; numberOfStars < level -1; numberOfStars++) {
                    System.out.print(star);
                }
                System.out.println(star);
            }
        }
    }
}
