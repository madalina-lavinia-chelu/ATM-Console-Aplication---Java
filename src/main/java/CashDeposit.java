import lombok.*;

import java.util.HashMap;

@Getter
@Setter



@ToString

public class CashDeposit {
    public static void operatieCashDeposit(HashMap<String, Accounts> dataBaseAccountsExtras, String user, float amount){
        Accounts account = dataBaseAccountsExtras.get(user);
        float balance = account.getBalance();

        account.setBalance(balance + amount);
        dataBaseAccountsExtras.put(account.getNumber(), account);
        System.out.println("Deposit completed");

    }
}
