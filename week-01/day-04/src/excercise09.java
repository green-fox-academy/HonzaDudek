public class excercise09 {
    public static void main(String[] args) {
        double heightInM = 1.87;
        double weightInKg = 81.2;
        double bmi = weightInKg / Math.pow(heightInM, 2);

        System.out.println("Your BMI is: " + String.format("%.2f", bmi) + ".");
    }
}
