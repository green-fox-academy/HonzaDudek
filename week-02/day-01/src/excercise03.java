public class excercise03 {
    public static void main(String[] args) {
        String typo = "Chinchill";

        System.out.println(appendAFunc(typo));
    }

    public static String appendAFunc(String text) {
       String newText = text + "a";
       return newText;
    }
}
