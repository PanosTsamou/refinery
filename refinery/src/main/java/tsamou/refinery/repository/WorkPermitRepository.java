package tsamou.refinery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tsamou.refinery.models.WorkPermit;

@Repository
public interface WorkPermitRepository extends JpaRepository <WorkPermit,Long> {
}
