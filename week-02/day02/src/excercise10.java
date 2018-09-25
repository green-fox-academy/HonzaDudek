import java.util.ArrayList;
import java.util.Arrays;

public class excercise10 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 5, 3, 4, 5));
        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(1, 7, 3, 4, 5));
        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(1, 5, 3, 7, 7));


        System.out.println(containSeven(arrayList, 7));
        System.out.println(containSeven(arrayList1, 7));
        System.out.println(containSeven(arrayList2, 7));

    }

    public static String containSeven(ArrayList list, int number) {
        if (list.contains(number)) {
            return "Hoooray";
        }
        else {
            return "Noooooo";
        }
    }
}
