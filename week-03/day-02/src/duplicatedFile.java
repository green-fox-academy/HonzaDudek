import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class duplicatedFile {
    public static void main(String[] args) {
        Path pathToFile = Paths.get("duplicated-Chars.txt");

        try {
            List<String> duplicated = Files.readAllLines(pathToFile);
            List<String> lines = new ArrayList<>();
            String line = "";
            for (int i = 0; i < duplicated.size(); i++) {
                line = duplicated.get(i);
                // (\\w)\\1+ will match any letter and place it in a regex capture group. This group is later accessed through the \\1+.
                line = line.replaceAll("(\\w)\\1+", "$1");
                System.out.println(line);
            }
            System.out.println(lines);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
