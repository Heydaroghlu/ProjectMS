package ProjectMS.repository;

import ProjectMS.model.Reclam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReclamRepository extends JpaRepository<Reclam,Integer> {
    public Reclam findByDeletedFalse();
    public Reclam findByDeletedTrue();
    public Reclam findByDescriptionNotLikeAndDeletedFalse(String like);
}
