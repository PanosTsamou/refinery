package tsamou.refinery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tsamou.refinery.models.Tank;

@Repository
public interface TankRepository extends JpaRepository <Tank,Long> {
}
