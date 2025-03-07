package ProjectMS.dto.tagDtos;

import ProjectMS.dto.baseDtos.baseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class putTagDto extends baseDto {
    String name;
}
