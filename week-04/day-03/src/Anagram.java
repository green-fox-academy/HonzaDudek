import java.util.Arrays;
import java.util.Collections;

public class Anagram {
    public String string1 = "";
    public String string2 = "";
    public boolean isAnagram = false;

    public static void main(String[] args) {
        Anagram newAnagram = new Anagram();
        newAnagram.string2 = "god";
        newAnagram.string1 = "god";

        System.out.println(newAnagram.isAnagram(newAnagram.string1, newAnagram.string2));
    }

    public boolean isAnagram(String string1, String string2) {
        if (string1.length() != string2.length()) {
            isAnagram = false;
            return isAnagram;
        } else {
            char[] a = string1.toCharArray();
            char[] b = string2.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            for (int i = 0; i < a.length; i++) {
                if (a[i] == b[i]) {
                    isAnagram = true;
                }
                else {
                    isAnagram = false;
                    break;
                }
            }
        }
        return isAnagram;
    }
}
