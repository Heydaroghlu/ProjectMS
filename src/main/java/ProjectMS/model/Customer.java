package ProjectMS.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Customer extends BaseEntity{
    String name;
    String logo;
}
