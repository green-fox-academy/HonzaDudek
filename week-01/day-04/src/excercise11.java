public class excercise11 {
    public static void main(String[] args) {
        int a = 3;
        a = a + 10;
        System.out.println("a = " + a);

        int b = 100;
        b = b - 7;
        System.out.println("b = " + b);

        int c = 44;
        c = c * 2;
        System.out.println("c = " + c);

        int d = 125;
        d = d / 5;
        System.out.println("d = " + d);

        double e = 3;
        e = Math.pow(e, 3);
        System.out.println("e = " + e);

        int f1 = 123;
        int f2 = 345;
        boolean comparison = f1 > f2;
        System.out.println(comparison);

        int g1 = 350;
        int g2 = 200;
        comparison = (g2 * 2) > g1;
        System.out.println(comparison);

        int h = 135798745;
        boolean isDivider = (h%11 == 0);
        System.out.println(isDivider);

        int i1 = 10;
        int i2 = 3;
        comparison = ((i2 * i2) < i1 && (i2 * i2 * i2) >i1);
        System.out.println(comparison);

        int j = 5;
        boolean isDividable = (j%3 == 0) || (j%5 == 0);
        System.out.println(isDividable);

        String k = "Apple";
        k = k + " " + k + " " + k + " " + k;
        System.out.println(k);
    }
}
