import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class logs {
    public static void main(String[] args) {
        uniqueIP("logs.txt");
    }

    public static void uniqueIP(String fileName) {
        try {
            Path pathToFile = Paths.get(fileName);
            List<String> lines = Files.readAllLines(pathToFile);
            List<String> ipAdress = new ArrayList<>();
            List<String> methods = new ArrayList<>();

            for (int i = 0; i < lines.size(); i++) {
                ipAdress.add(lines.get(i).split("   ")[1]);
            }

            for (int i = 0; i < lines.size(); i++) {
                methods.add(lines.get(i).substring(41, 45).trim());
            }

            List<String> uniqueIp = uniqueList(ipAdress);

            System.out.println("Number of unique items: " + uniqueIp.size());

            System.out.println("Number of POST methods: " + countOccurances(methods, "POST"));
            System.out.println("Number of POST methods: " + countOccurances(methods, "GET"));

        } catch (IOException e) {
            System.out.println("Unable to read file: my-file.txt");
        }
    }

    public static List uniqueList(List list) {
        List<String> uniqueValuesList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!uniqueValuesList.contains(list.get(i))) {
                uniqueValuesList.add(list.get(i).toString());
            }
        }
        return uniqueValuesList;
    }

    public static int countOccurances(List list, String item) {
        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(item)) {
                counter++;
            }
        }
        return counter;
    }
}
