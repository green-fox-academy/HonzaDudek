import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class writeMultipleLines {
    public static void main(String[] args) {
        writeToFile("new-file.txt", "apple", 20);
    }

    public static void writeToFile(String path, String word, int numberOfLines) {
        Path newPath = Paths.get(path);
        try {
            List<String> lines = new ArrayList<>(numberOfLines);
            for (int i = 0; i < numberOfLines; i++) {
                lines.add(word);
            }
            Files.write(newPath, lines);

        } catch (IOException e) {
            System.out.println("Could not write to a given file");
        }
    }

}

