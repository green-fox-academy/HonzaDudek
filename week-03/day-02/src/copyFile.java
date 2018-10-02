import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class copyFile {
    public static void main(String[] args) {
        copyFile("my-file.txt", "my-filename-copy.txt");
    }

    public static boolean copyFile(String fileName, String newFileName) {
        boolean success = true;
        Path newPath = Paths.get(newFileName);
        List<String> fileContent = new ArrayList<>();
        try {
            fileContent = Files.readAllLines(Paths.get(fileName));
            Files.write(newPath, fileContent);

        } catch (IOException e) {
            System.out.println("Sorry, Could, not read file " + fileName);
            success = false;
        }
        return success;
    }
}
