package ProjectMS.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MobileApp extends BaseEntity{
    String androidLink;
    String iosLink;
}
