import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class printEachLine {
    public static void main(String[] args) {
        try {
            Path pathToFile = Paths.get("my-file.txt");
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
