package application.services.gfa.services;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private ArrayList<String> names;

    public StudentServiceImpl() {
        names = new ArrayList<>();
        names.add("Sanyi");
        names.add("Lilla");
        names.add("John");
    }

    public List<String> findAll() {
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
}

