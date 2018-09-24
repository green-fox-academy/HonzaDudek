public class excercise18 {
    public static void main(String[] args) {
        int[] ai = {3, 4, 5, 6, 7};
        System.out.println("Sum of the 'ai' array is: " + sum(ai));
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
