package tsamou.refinery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tsamou.refinery.models.Unit;

@Repository
public interface UnitRepository extends JpaRepository <Unit,Long> {
}
