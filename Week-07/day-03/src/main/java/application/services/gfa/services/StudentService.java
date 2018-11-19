package application.services.gfa.services;

import java.util.List;

public interface StudentService {
    List<String> findAll();
    void save(String student);
    int getNumberOfStudents();
    String findStudent(String name);
}
