package ProjectMS.repository;

import ProjectMS.model.Statistic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StatisticRepository extends JpaRepository<Statistic, Integer> {
    public List<Statistic> findAllByDeletedFalse();
}
