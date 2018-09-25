public class excercise01 {
    public static void main(String[] args) {
        String example = "In dishwasher far far away";

        String replaced;
        replaced = example.replaceAll("dishwasher", "galaxy");

        example = replaced;

        System.out.println(example);
    }
}
