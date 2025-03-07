package ProjectMS.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product extends BaseEntity {
    String name;
    String title;
    String description;
    String img;
    Integer count;
    double costPrice;
    double salePrice;
    double discount;
    @ManyToOne(fetch = FetchType.LAZY)
    Tag tag;
    @ManyToOne(fetch = FetchType.LAZY)
    Category category;
}
