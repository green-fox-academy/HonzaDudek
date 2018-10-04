public class StringConverter {
        public static void main(String[] args) {
            System.out.println(changeX("douxbxxlexyxX"));
        }

        public static String changeX(String string) {
            if (string.contains("x")) {
                System.out.println(string);
                return string.replace("x", "y");
            }
            else {
                return string;
            }
        }
}
