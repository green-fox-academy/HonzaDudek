import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class printEachLine {
    public static void main(String[] args) {
        printEachLine("my-file.txt");
    }

    public static void printEachLine(String fileName) {
        try {
            Path pathToFile = Paths.get(fileName);
//            Files.write(pathToFile, "Hello World".getBytes());

            List<String> lines = Files.readAllLines(pathToFile);
            for (String line : lines
            ) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Unable to read file: my-file.txt");
        }
    }
}
