import java.util.*;

public class Main {

    public static void main(String[] args) {
        areAnagram("a net", "neat");
    }

    public static boolean areAnagram(String string1, String string2) {

        char[] string1Array = string1.toCharArray();
        char[] string2Array = string2.toCharArray();

        List<Character> string1CharList = new ArrayList<>();
        List<Character> string2CharList = new ArrayList<>();

        for (int i = 0; i < string1.length(); i++) {
            string1CharList.add(string1Array[i]);
        }

        for (int i = 0; i < string2.length(); i++) {
            string2CharList.add(string2Array[i]);
        }

        for (int i = 0; i < string1CharList.size(); i++) {
            if (string1CharList.get(i) == ' ') {
                string1CharList.remove(string1CharList.get(i));
            }
        }

        for (int i = 0; i < string2CharList.size(); i++) {
            if (string2CharList.get(i) == ' ') {
                string2CharList.remove(string2CharList.get(i));
            }
        }

        Collections.sort(string1CharList);
        Collections.sort(string2CharList);

        if (string1CharList.size() != string1CharList.size()) {
            for (int i = 0; i < string1CharList.size(); i++) {
                if (string1CharList.get(i).equals(string2CharList.get(i))) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

}
