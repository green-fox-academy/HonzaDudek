import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class reversedLines {
    public static void main(String[] args) {

        reverseLines("reversed-lines.txt");
    }

    public static void reverseLines(String filename) {
        Path pathToFile = Paths.get(filename);
        String reversedLine = "";
        try {
            List<String> fileContent = Files.readAllLines(pathToFile);
            for (int i = 0; i < fileContent.size(); i++) {
                for (int j = fileContent.get(i).length() - 1; j >= 0; j--) {
                    reversedLine += fileContent.get(i).charAt(j);
                }
                reversedLine = reversedLine + "\n";
                System.out.println(reversedLine);
                reversedLine = "";
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
