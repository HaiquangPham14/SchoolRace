package SchoolCompetition.repository;

import SchoolCompetition.model.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
