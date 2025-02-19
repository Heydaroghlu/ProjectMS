package ProjectMS.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;

@Data
@Entity
@EqualsAndHashCode(callSuper=false)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Contact extends BaseEntity {
    String name;
    String phone;
    String email;
    String message;
}
