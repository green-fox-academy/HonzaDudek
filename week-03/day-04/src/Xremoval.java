public class Xremoval {
    public static void main(String[] args) {
        System.out.println(removeX("douxbxxlexyxX"));
    }

    public static String removeX(String string) {
        if (string.contains("x")) {
            return removeX(string.substring(0,string.indexOf("x")) + string.substring(string.indexOf("x")+1));
        }
        else {
            return string;
        }

    }
}
