import java.util.ArrayList;
import java.util.Arrays;

public class excercise11 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
        checkNums(list);
    }

    public static boolean checkNums(ArrayList list) {
        ArrayList<Integer> elementsToCheck = new ArrayList<>(Arrays.asList(4,8,12,16));
        if (list.containsAll(elementsToCheck)) {
            System.out.println(true);
            return true;
        }
        else {
            System.out.println(false);
            return false;
        }
    }
}
