package tsamou.refinery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tsamou.refinery.models.ToolBox;

@Repository
public interface ToolBoxRepository extends JpaRepository <ToolBox,Long> {
}
