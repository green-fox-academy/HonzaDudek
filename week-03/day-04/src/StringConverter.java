public class StringConverter {
        public static void main(String[] args) {
            System.out.println(changeX("douxbxxlexyxX"));
        }

        static int counter = 0;

        public static String changeX(String string) {
            int x = 0;
            String firstSub;
            String secondSub;

            counter++;
            System.out.println(counter);

            if (string.contains("x")) {

                return changeX(string.substring(0,string.indexOf("x")) + "y" + string.substring(string.indexOf("x")+1));
            }
            else {
                return string;
            }
        }
}
