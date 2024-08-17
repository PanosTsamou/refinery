package tsamou.refinery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tsamou.refinery.models.Tools;

@Repository
public interface ToolsRepository extends JpaRepository <Tools,Long> {
}
