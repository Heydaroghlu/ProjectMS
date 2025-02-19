package ProjectMS.dto.contactDtos;

import ProjectMS.dto.baseDtos.baseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class getContactDto extends baseDto {
    String name;
    String phone;
    String email;
    String message;
}
