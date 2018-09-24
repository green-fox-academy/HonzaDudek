public class excercise16 {
    public static void main(String[] args) {
        String[] animals = {"koal", "pand", "zebr"};
        appendA(animals);
    }

    public static void appendA(String[] appendedAnimals) {
        for (int i = 0; i < appendedAnimals.length; i++) {
            appendedAnimals[i] = appendedAnimals[i] + "a";
            System.out.println(appendedAnimals[i]);
        }
    }
}
