package bluegrizzly.example.jpaintro.repositories;

import bluegrizzly.example.jpaintro.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    StudentRepository studentRepository;

    @Test
    void testByName(){
        List<Student> ls = studentRepository.findAllByName("Chris");
        assertEquals(1, ls.size());
    }
    @Test
    void testAll(){
        List<Student> ls = studentRepository.findAll();
        assertEquals(3, ls.size());
    }
}