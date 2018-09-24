import java.util.Arrays;

public class unique {
    public static void main(String[] args) {
        unique(new int[] {1,1,6,3,5});
    }

    public static int[] unique(int[] array) {
            for (int i = 0; i < array.length; i++) {
                int number = array[i];
                for (int j = 0; j < array.length; j++) {
                    if (number == array[j] && array[i] != array[j]) {
                        break;
                    }
                    else {
                        System.out.print(number);
                    }
                }
            }
        return array;
    }
}
