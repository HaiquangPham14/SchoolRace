package SchoolCompetition.repository;

import SchoolCompetition.model.entity.Coach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface CoachRepository extends JpaRepository<Coach, Integer> {
}
