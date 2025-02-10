package ProjectMS.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jdk.jfr.DataAmount;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import lombok.experimental.FieldNameConstants;

@Data
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Reclam {
    @Id
    Integer id;
    String name;
    String description;
}
