public class Main {
    public static void main(String[] args) {
//        Gnirts string = new Gnirts("example");
//        System.out.println(string.charAt(6));
//
//        Shifter string2 = new Shifter("example", 2);
//        System.out.println(string2.charAt(0));


        for (int i = 0; i < 10; i++) {
            String star = "";
            String space = " ";

            for (int j = 0; j > 0; j--) {
                space += space;
                star += "*";
                System.out.print(star);
            }
            System.out.println();
        }


    }
}
