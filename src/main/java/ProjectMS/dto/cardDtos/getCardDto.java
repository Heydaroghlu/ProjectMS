package ProjectMS.dto.cardDtos;

import ProjectMS.dto.baseDtos.baseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class getCardDto extends baseDto {
    String title;
    String description;
    String image;
    String link;
}
