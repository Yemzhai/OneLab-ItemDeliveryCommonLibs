package item.delivery.common.libs.model;

import lombok.Data;
import java.util.List;

@Data
public class CustomerDTO {
    private long id;
    private String name;
    private int money;
    private List<ItemDTO> itemsList;
}
