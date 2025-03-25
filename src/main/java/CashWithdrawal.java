
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;

@Getter
@Setter


@ToString

public class CashWithdrawal {
    public static void operatieCashWithdrawal(HashMap<String, Accounts> dataBaseAccountsExtras, String user, float amount) {

        Accounts account = dataBaseAccountsExtras.get(user);
        float balance = account.getBalance();

        if (Helper.validateAmount(amount) && balance - amount >= 0) {
            account.setBalance(balance - amount);
            dataBaseAccountsExtras.put(account.getNumber(), account);
            System.out.println("Withdraw completed");
        } else {
            Screen.IllegalOperation();
            //throw new InvalidAmountException("Invalid Amount Exception");
            Screen.amountWithDrawal();
        }


    }
}
