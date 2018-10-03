import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class reversedOrder {
    public static void main(String[] args) {
        reverseOrder("reversed-order.txt");
    }

    public static void reverseOrder(String fileName) {
        Path pathToFile = Paths.get(fileName);
        try {
            List<String> fileContent = Files.readAllLines(pathToFile);
            List<String> reversedFile = new ArrayList<String>();
            for (int i = 0; i < fileContent.size() ; i++) {
                for (int j = fileContent.size(); j > 0 ; j--) {
                    reversedFile.add(i, fileContent.get(fileContent.size()-1-i));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
