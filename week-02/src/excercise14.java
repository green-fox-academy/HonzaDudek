public class excercise14 {
    public static void main(String[] args) {
        int[] numList = {3, 4, 5, 6, 7};
        doubling(numList);
    }

    public static void doubling(int[] numbersToDouble) {
        for (int i = 0; i < numbersToDouble.length; i++) {
            numbersToDouble[i] *= 2;
            System.out.println(numbersToDouble[i]);
        }
    }
}
