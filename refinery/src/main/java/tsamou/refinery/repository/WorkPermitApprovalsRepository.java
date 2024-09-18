package tsamou.refinery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tsamou.refinery.models.WorkPermitApprovals;

@Repository
public interface WorkPermitApprovalsRepository extends JpaRepository <WorkPermitApprovals, Long> {
}
