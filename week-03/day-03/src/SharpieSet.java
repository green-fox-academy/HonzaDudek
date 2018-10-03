import java.util.*;

public class SharpieSet {
    List<Sharpie> sharpieSet = new ArrayList<>();

    public int countUsable(List<Sharpie> list) {
        int numberOfUsableSharpies = 0;
        if (list.get(0).inkAmmount > 0) {
            numberOfUsableSharpies++;
        }
        return numberOfUsableSharpies;
    }
}
