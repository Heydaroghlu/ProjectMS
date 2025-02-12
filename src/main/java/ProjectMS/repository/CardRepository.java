package ProjectMS.repository;

import ProjectMS.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CardRepository extends JpaRepository<Card, Integer> {
    List<Card> findByDeletedFalse();
    List<Card> findByDeletedTrue();
    List<Card> findByImageEquals(String image);
}
