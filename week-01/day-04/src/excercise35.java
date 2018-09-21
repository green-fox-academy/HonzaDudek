public class excercise35 {
    public static void main(String[] args) {

        // One iteration creates one row
        for (int row = 1; row <= 8; row++) {

            // If the row is even
            if (row % 2 == 0) {

                // " %" is printed four times
                for (int column = 1; column <= 4; column++) {
                    System.out.print(" %");
                }
                System.out.println();
            }

            // if row is odd
            else {

                // "% " is printed four times
                for (int column = 1; column <= 4; column++) {
                    System.out.print("% ");
                }

                // Line breaks and new line is created
                System.out.println();
            }
        }
    }
}
