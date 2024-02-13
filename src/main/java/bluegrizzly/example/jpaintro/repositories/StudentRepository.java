package bluegrizzly.example.jpaintro.repositories;

import bluegrizzly.example.jpaintro.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findAllByName(String name);

    List<Student> findById(int id);
}
