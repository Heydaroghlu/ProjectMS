package ProjectMS.dto.userDtos;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class getUserDto {
    private Long id;
    private String username;
}
