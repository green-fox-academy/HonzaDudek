public class excercise04 {
    public static void main(String[] args) {
        String todoText = " - Buy milk\n";
        String indentation = "  ";

        StringBuilder todoList = new StringBuilder(todoText);
        todoList.append(" - Download games\n");
        todoList.append(indentation + "- Diablo\n");

        System.out.println(todoList);
    }
}
