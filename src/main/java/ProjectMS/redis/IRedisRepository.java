package ProjectMS.redis;

import ProjectMS.dto.reclamDtos.reclamGetDto;
import ProjectMS.model.Reclam;

public interface IRedisRepository {
    void save(String key, Reclam location);
    Reclam getById(String key);
}
