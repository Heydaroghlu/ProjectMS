package ProjectMS.repository;

import ProjectMS.model.Partner;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PartnerRepository extends JpaRepository<Partner, Integer> {
    @EntityGraph(value = "select *from partners where deleted=:deleted")
    List<Partner> findAllByDeleted(boolean deleted);
}
