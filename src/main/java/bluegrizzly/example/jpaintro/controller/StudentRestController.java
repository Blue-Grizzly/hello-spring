package bluegrizzly.example.jpaintro.controller;

import bluegrizzly.example.jpaintro.JpaIntroApplication;
import bluegrizzly.example.jpaintro.model.Student;
import bluegrizzly.example.jpaintro.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentRestController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/students")
    public List<Student> students() {
        return studentRepository.findAll();
    }

    @GetMapping("students/{name}")
    public List<Student> getAllStudentsByName(@PathVariable String name) {
        return studentRepository.findAllByName(name);
    }

    @PostMapping("/students")
    public Student postStudent(@RequestBody Student student) {

        return studentRepository.save(student);
    }

    @PutMapping("/students/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student reqBody) {
        reqBody.setId(id);
        JpaIntroApplication.logger.info("Updated " + id);
        return studentRepository.save(reqBody);
    }

    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable int id) {
        studentRepository.deleteById(id);
        JpaIntroApplication.logger.info("Deleted " + id);
        return "Deleted " + id;
    }

}
