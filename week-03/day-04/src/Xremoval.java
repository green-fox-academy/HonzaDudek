public class Xremoval {
    public static void main(String[] args) {
        System.out.println(removeX("douxbxxlexyxX"));
    }

    public static String removeX(String string) {
        if (string.contains("x")) {
            return string.replace("x", "");
        }
        else {
            return string;
        }

    }
}
