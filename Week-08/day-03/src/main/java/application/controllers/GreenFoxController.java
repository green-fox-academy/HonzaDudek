package application.controllers;

import application.services.gfa.services.StudentServiceImpl;
import application.services.gfa.services.StudentServiceToFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreenFoxController {

    @Autowired
    StudentServiceImpl students;

    @Autowired
    StudentServiceToFile studensInFile;

    @RequestMapping(value = "/gfa")
    public String showGFAHomepage(Model model) {
        model.addAttribute("numberOFStudents", students.getNumberOfStudents());
        return "gfa";
    }

    @RequestMapping(value = "/gfa/list")
    public String listAllStudents(Model model) {
        model.addAttribute("listOfStudents", students.findAll());
        return "list";
    }

    @RequestMapping(value = "/gfa/list-from-file")
    public String listAllStudentsFromFile(Model model) {
        model.addAttribute("listOfStudents", studensInFile.findAll());
        return "list-from-file";
    }

    @RequestMapping(value = "/gfa/add")
    public String addStudent() {
        return "add";
    }

    @RequestMapping(value = "/gfa/save", params = "studentName", name = "studentName")
    public String saveStudent(@RequestParam(name = "studentName") String student) {
        students.save(student);
        return "add";
    }

    @RequestMapping(value = "/gfa/check")
    public String showStudentCheck() {
        return "check";
    }

    @RequestMapping(value = "/gfa/check", params = "studentNameCheck", name = "studentNameCheck")
    public String checkStudent(Model model, @RequestParam(name = "studentNameCheck") String student) {
        model.addAttribute("student", students.findStudent(student));
        return "check";
    }

}
