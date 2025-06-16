package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Account {

    private final String name;
    private final String phone;
    private final String fax;
    private final String rating;

}
