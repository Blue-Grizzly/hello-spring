package bluegrizzly.example.jpaintro.config;

import bluegrizzly.example.jpaintro.model.Student;
import bluegrizzly.example.jpaintro.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;
    @Override
    public void run(String... args) throws Exception {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.setName("Chris");
        s1.setBornDate(LocalDate.of(1991, 11, 15));
        s1.setBornTime(LocalTime.of(4, 12, 45));
        s2.setName("Mike");
        s2.setBornDate(LocalDate.of(1987, 1, 5));
        s2.setBornTime(LocalTime.of(13, 43, 01));
        s3.setName("Jinx");
        s3.setBornDate(LocalDate.of(2005, 4, 10));
        s3.setBornTime(LocalTime.of(14, 22, 33));
        studentRepository.save(s1);
        studentRepository.save(s2);
        studentRepository.save(s3);
    }
}
