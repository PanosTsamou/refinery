package tsamou.refinery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tsamou.refinery.models.Department;

@Repository
public interface DepartmentRepository extends JpaRepository <Department, Long> {
}
