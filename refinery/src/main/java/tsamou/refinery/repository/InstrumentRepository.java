package tsamou.refinery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tsamou.refinery.models.Instrument;

@Repository
public interface InstrumentRepository extends JpaRepository <Instrument,Long> {
}
