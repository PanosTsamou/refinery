package tsamou.refinery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tsamou.refinery.models.Section;

@Repository
public interface SectionRepository extends JpaRepository <Section,Long> {
}
