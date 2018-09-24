import java.util.Scanner;

public class excercise13 {
    public static void main(String[] args) {

        System.out.println("Please provide number of rows and columns: ");
        Scanner scanner = new Scanner(System.in);
        int columns = scanner.nextInt();
        int rows = columns;

        matrix(columns,rows);

    }

    public static void matrix(int columns, int rows) {
        int matrix[][] = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == j) {
                    matrix[j][i] = 1;
                }
                else {
                    matrix[j][i] = 0;
                }
                System.out.print(matrix[j][i]);
            }
            System.out.println();
        }


    }
}
