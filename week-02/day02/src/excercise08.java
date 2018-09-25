import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class excercise08 {
    public static void main(String[] args) {
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        addA(far);
    }

    public static void addA(List list) {

        for (int i = 0; i < list.size(); i++) {
            StringBuilder sb = new StringBuilder(list.get(i).toString());
            sb.append("a");
            list.set(i, sb.toString());
        }
        System.out.println(list);
    }
}
