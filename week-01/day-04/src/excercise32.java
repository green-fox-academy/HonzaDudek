import java.util.Scanner;

public class excercise32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLines = scanner.nextInt();

        String space = " ";
        String star = "*";

        // Initialize loop, that creates line up to number of lines, that user wants
        for (int level = 0; level < numberOfLines; level++) {
            // Checks, whether the current row is first or last
            if (level == 0 || level == numberOfLines - 1) {

                // If the row is first or last, it prints stars based on total number of rows
                for (int numberOfStars = 0; numberOfStars < numberOfLines; numberOfStars++) {
                    System.out.print(star);
                }
                System.out.println();
            }

            // If level is not the first or last it prints the inside of a box
            else {

                // Prints first star in a row
                System.out.print(star);

                // Program loops and adds spaces based on the position of current row - 1 is subtacted because the fisrt
                // and last rows are not included

                for (int numberOfSpaces = 0; numberOfSpaces < level - 1; numberOfSpaces++) {
                    System.out.print(space);
                }

                // Prints diagonal star
                System.out.print(star);

                // Prints as many spaces as there is left to the end of the row, 2 is subtracted because there if the
                // first and diagonal star already in the row. With each row, the number of spaces decreases
                for (int numberOfSpaces = numberOfLines - level - 2; numberOfSpaces > 0; numberOfSpaces--) {
                    System.out.print(space);
                }

                // Prints the last star in a row
                System.out.print(star);

                // Creates next row
                System.out.println();
            }
        }
    }
}

