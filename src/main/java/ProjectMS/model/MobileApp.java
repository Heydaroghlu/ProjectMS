package ProjectMS.model;

import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MobileApp extends BaseEntity{
    String androidLink;
    String iosLink;
}
