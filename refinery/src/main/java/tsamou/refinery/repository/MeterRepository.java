package tsamou.refinery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tsamou.refinery.models.Meter;

@Repository
public interface MeterRepository extends JpaRepository <Meter,Long> {
}
