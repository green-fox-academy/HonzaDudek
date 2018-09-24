public class excercise19 {
    public static void main(String[] args) {
        int[] aj = {3, 4, 5, 6, 7, 8, 9, 10};
        reverse(aj);
    }
    
    public static void reverse(int[] array) {
        int temp = 0;
        int temp1 = 0;
        for (int i = 0; i < array.length - 1; i++) {
                temp = array[i];
                temp1 = array[array.length - 1 - i];

                array[i] = temp1;
                array[array.length - 1 - i] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
