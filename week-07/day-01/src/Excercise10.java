import java.util.ArrayList;
import java.util.List;

public class Excercise10 {

    public static List<Fox> foxes = new ArrayList<>();

    public static void main(String[] args) {
        foxes.add(new Fox("Karel", "pallida", "white"));
        foxes.add(new Fox("Adam", "velox", "green"));
        foxes.add(new Fox("Franta", "pallida", "green"));
        foxes.add(new Fox("Bob", "velox", "brown"));
        foxes.add(new Fox("Frank", "pallida", "green"));

        foxes.stream()
                .filter(fox -> fox.type.equals("pallida") && fox.color.equals("green"))
                .forEach(fox -> System.out.println(fox.name));
    }

}
