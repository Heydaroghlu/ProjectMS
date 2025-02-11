package ProjectMS.dto.cardDtos;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class postCardDto {
    String title;
    String description;
    String image;
    String link;
}
