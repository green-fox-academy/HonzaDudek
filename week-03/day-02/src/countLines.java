import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class countLines {
    public static void main(String[] args) {
        System.out.println(numebrOfLinesInFile(Paths.get("counterOfLines.txt").toString()));

    }

    public static int numebrOfLinesInFile (String filename) {
        int counterOfLines = 0;
        try {
            List<String> lines = Files.readAllLines(Paths.get(filename));
            for (String line : lines
                 ) {
                counterOfLines++;
            }
        } catch (IOException e) {
            counterOfLines = 0;
        }
        return counterOfLines;
    }
}
