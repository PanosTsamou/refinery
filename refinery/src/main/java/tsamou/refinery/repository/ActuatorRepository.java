package tsamou.refinery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tsamou.refinery.models.Actuator;

@Repository
public interface ActuatorRepository extends JpaRepository <Actuator, Long> {
}
