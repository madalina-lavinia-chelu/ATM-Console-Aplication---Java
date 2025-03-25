import lombok.*;

import java.util.HashMap;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Builder

//- An account has a balance on which you can apply credit or debit transactions???
public class Accounts {
    private String number;
    private String pin;
    private float balance;
    private String name;
}






