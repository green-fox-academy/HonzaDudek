import java.util.ArrayList;
import java.util.List;

public class Sum {

    public List listOfIntegers = new ArrayList();

    public int Sum(List<Integer> listOfIntegers) {
        int sum = 0;
        for (Integer integer: listOfIntegers
             ) {
            sum += integer;
        }
        return sum;
    }

}
