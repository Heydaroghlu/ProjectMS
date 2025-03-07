package ProjectMS.dto.tagDtos;

import ProjectMS.dto.baseDtos.baseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class getTagDto extends baseDto {
    String name;
}
