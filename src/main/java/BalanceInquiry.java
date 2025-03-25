import lombok.*;

import java.util.HashMap;

@Getter
@Setter

@ToString

public class BalanceInquiry  {


    public static void viewBalance(HashMap<String, Accounts> dataBaseAccountsExtras, String user){
        System.out.println("Balance: "+ dataBaseAccountsExtras.get(user).getBalance()+ "$");
    }
}
