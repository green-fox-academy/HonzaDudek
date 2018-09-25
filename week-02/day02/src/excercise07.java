import java.util.ArrayList;
import java.util.Arrays;

public class excercise07 {
    public static void main(String[] args) {
        ArrayList<String> girls = new ArrayList<>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<>(Arrays.asList("Joe","Fred","Tom","Todd","Neef", "Jeff"));
        addTogether(girls, boys);
    }

    public static void addTogether(ArrayList arrayList1, ArrayList arrayList2) {
        ArrayList<String> firstList = new ArrayList<>();
        firstList.addAll(arrayList1);
        ArrayList<String> secondList = new ArrayList<>();
        secondList.addAll(arrayList2);
        ArrayList<String> finalList = new ArrayList<>();
        for (int i = 0; i < firstList.size() + secondList.size(); i++) {
            finalList.add(i, firstList.get(i));
            finalList.add(i + 1, secondList.get(i));
            i++;
        }
        System.out.println(finalList);
    }
}
