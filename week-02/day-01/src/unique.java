import java.util.ArrayList;
import java.util.Arrays;

public class unique {
    public static void main(String[] args) {
        unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34});
    }

    public static ArrayList<Integer> unique(int[] array) {
        int[] temp = new int[array.length + 1];
        System.out.println(temp.length);
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }

        temp[temp.length - 1] = 0;

         ArrayList<Integer> temp2 = new ArrayList<Integer>();
         Arrays.sort(temp);
         for (int i = 0; i < temp.length - 1; i++) {
             if (temp[i] != temp[i + 1]) {
                 temp2.add(temp[i]);

             }
         }

        for (int i = 0; i < temp2.size(); i++) {
            System.out.print(temp2.get(i) + ", ");
        }

//            for (int i = 0; i < array.length - 1; i++) {
//                int number = array[i];
//                for (int j = 0; j < array.length; j++) {
//                    if (number == array[j] && array[i] != array[j]) {
//                        break;
//                    }
//                    else {
//                        System.out.print(number);
//                    }
//                }
//            }
        return temp2;
    }
}
