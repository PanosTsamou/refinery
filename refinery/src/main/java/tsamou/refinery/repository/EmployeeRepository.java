package tsamou.refinery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tsamou.refinery.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository <Employee,Long> {
}
