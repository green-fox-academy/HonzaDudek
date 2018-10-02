import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class reversedLines {
    public static void main(String[] args) {
        reverseLines("reversed-lines.txt");
    }

    public static void reverseLines(String filename) {
        Path pathToFile = Paths.get(filename);

        try {
            List<String> fileContent = Files.readAllLines(pathToFile);
            for (int i = 0; i < fileContent.size(); i++) {
                List<Character> lettersInLine = new ArrayList<>();
                for (int j = fileContent.get(i).length() - 1; j >=0 ; j--) {
                    lettersInLine.add(fileContent.get(i).charAt(j));
                }
                fileContent.add(lettersInLine.toString());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
