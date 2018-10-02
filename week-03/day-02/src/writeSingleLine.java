import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class writeSingleLine {
    public static void main(String[] args) {

    }

    public static void writeOneLine(String fileName, String line) {
        Path myPath = Paths.get(fileName);
        try {
            Files.write(myPath, line.getBytes());
        } catch (IOException e) {
            System.out.println("Unable to write to file " + Paths.get("my-file.txt").toString() );
        }
    }


}
