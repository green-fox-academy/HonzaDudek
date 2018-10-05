public class AddStarChar {
    public static void main(String[] args) {
        System.out.println(addStar("Hello World", 0));
    }

    public static String addStar(String string, int index) {
        if (index == string.length()) {
            return string;

        } else {
            return addStar(string.substring(0, index +1) + "*" + string.substring(index + 2), index + 1);

        }
    }
}
