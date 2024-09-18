package tsamou.refinery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tsamou.refinery.models.WorkingOrder;

@Repository
public interface WorkingOrderRepository extends JpaRepository <WorkingOrder, Long> {
}
