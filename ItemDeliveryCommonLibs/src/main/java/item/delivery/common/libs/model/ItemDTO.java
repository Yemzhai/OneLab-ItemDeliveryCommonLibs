package item.delivery.common.libs.model;

import lombok.Data;

@Data
public class ItemDTO {
    private long id;
    private String title;
    private Boolean uniqueness;
    private int quantity;

}
