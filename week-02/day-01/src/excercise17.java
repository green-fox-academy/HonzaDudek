public class excercise17 {
    public static void main(String[] args) {
        String[] abc = {"first", "second", "third"};
        swap(abc, 0, 2);
    }

    public static String[] swap(String[] array, int first, int second) {
        String arrayTemp = "";
        arrayTemp = array[first];
        array[first] = array[second];
        array[second] = arrayTemp;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        return array;
    }
}
