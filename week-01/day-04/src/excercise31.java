import java.util.Scanner;

public class excercise31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = scanner.nextInt();
        String star = "*";
        String space = " ";

        for (int level = 0; level < numberOfLines; level++) {
                if (level == 0 || level == numberOfLines -1) {
                    for (int numberOfStars = numberOfLines; numberOfStars > 0; numberOfStars--) {
                        System.out.print(star);
                    }
                }
                else {
                    System.out.print(star);
                    for (int numberOfSpaces = 0; numberOfSpaces < numberOfLines - 2; numberOfSpaces++){
                        System.out.print(space);
                    }
                    System.out.print(star);
                }
            System.out.println();
        }
    }
}

