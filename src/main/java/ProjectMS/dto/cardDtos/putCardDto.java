package ProjectMS.dto.cardDtos;

import ProjectMS.dto.baseDtos.baseDto;
import lombok.Data;

@Data
public class putCardDto extends baseDto {
    String title;
    String description;
    String image;
    String link;
}
