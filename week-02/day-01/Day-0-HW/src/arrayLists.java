import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class arrayLists {

    public static void main(String[] args) {

        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(90);
        grades.add(85);
        grades.add(70);

        // Iterates through the collection (ArrayList) and returns values on given indexes
        for (int i = 0; i < grades.size(); i++) {
            System.out.println("Grade " + i + ": " + grades.get(i));
        }

        // Removes value from given index / use .removeRange(start, end) to remove values in given range
        grades.remove(1);

        System.out.println();
        for (int i = 0; i < grades.size(); i++) {
            System.out.println("Grade " + i + ": " + grades.get(i));
        }

        System.out.println();

        // Initializes array lists
        ArrayList arrayListOne;
        arrayListOne = new ArrayList();

        ArrayList arrayListTwo = new ArrayList();

        // Initializes arrayList of given type
        ArrayList <String> names = new ArrayList<>();

        names.add("John Smith");
        names.add("Jow  Doe");
        names.add("Oliver Miller");

        names.add(2, "Jack Ryan");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println();

        // Changes the value on index 0
        names.set(0, "Joe Adams");
        System.out.print("New value on index 0: ");
        System.out.println(names.get(0));

    }
}



