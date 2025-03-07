package ProjectMS.model;

import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@EqualsAndHashCode(callSuper = false)
public class Partner extends BaseEntity{
    String name;
    String img;
    String url;
}
