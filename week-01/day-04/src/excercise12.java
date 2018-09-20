public class excercise12 {
    public static void main(String[] args) {
        double a = 12;
        double b = 10;
        double c = 3;

        double surface = 2 * (a * b + b * c + a * b);
        double volume = a * b * c;

        System.out.println("Surface Area: " + surface);
        System.out.println("Volume: " + volume);
    }
}
