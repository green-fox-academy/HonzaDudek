public class AddStarChar {
    public static void main(String[] args) {
        System.out.println(addStar("Hello world"));
    }

    public static String addStar(String string) {
        if (string.length() < string.length()*2) {
            System.out.println(string);
            return  string.length() + 1 + (string.substring(0,1 ) + "*" + string.substring(2)) ;
        }
        else {
            return string;
        }
    }
}
