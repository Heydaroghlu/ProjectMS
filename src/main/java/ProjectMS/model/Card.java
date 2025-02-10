package ProjectMS.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Card extends BaseEntity{
    String title;
    String description;
    String image;
    String link;
}
