package application.services.gfa.services;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceToFile {

    private static Path pathToFile = Paths.get("names.txt");
    private List<String> names;

    public StudentServiceToFile() {
        createNewFileWithStudents("names.txt");

    }

    public List<String> findAll() {
        try {
            names = Files.readAllLines(pathToFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return names;
    }

    public void save(String student) {
        names.add(student);
    }

    public int getNumberOfStudents() {
        return names.size();
    }

    public String findStudent(String name) {
        if (names.contains(name)) {
            return "Student is in the list";
        }
        return "Student is not on the list";
    }

    private static void createNewFileWithStudents(String filename) {
        // Gets path to a new file
        Path pathToTasks = Paths.get(filename);
        // If the file with same name does not exists, it creates new file
        if (!Files.exists(pathToTasks)) {
            try {
                Files.createFile(pathToTasks);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void writeToFile() {
        List<String> names = new ArrayList<>();
        try {
            for (String name : names
            ) {
                names.add(name);
            }
            Files.write(pathToFile, names);
            names.clear();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
