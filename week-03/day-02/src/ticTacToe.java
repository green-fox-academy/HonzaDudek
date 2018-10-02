import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ticTacToe {
    public static void main(String[] args) {
        whoIsWinner("tic-tac-toe/win-o.txt");
    }

    public static void whoIsWinner(String fileName) {
        Path newPath = Paths.get(fileName);
        List<String> rows = new ArrayList<String>();
        try {
            List<String> fileContent = Files.readAllLines(newPath);
            for (int i = 0; i < fileContent.size(); i++) {
                System.out.println(fileContent.get(i));
                rows.add(fileContent.get(i));
            }
            System.out.println(rows);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
