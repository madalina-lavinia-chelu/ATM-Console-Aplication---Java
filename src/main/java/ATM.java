

import java.util.HashMap;
import java.util.Scanner;

public class ATM {

    Keypad keypad = new Keypad();

    static HashMap<String, Accounts> dataBaseAccountsExtras = BankDatabase.getDataBaseAccounts();

    void running(){

        String user = Login.validareUser(dataBaseAccountsExtras);
        Screen.Meniu();
        boolean flag = true;
        while (flag)
        {
            switch (keypad.readInt()){
                case 1: BalanceInquiry.viewBalance(dataBaseAccountsExtras, user);
                    break ;
                case 2: Screen.amountWithDrawal();

                    float value = keypad.readFloat();
                    CashWithdrawal.operatieCashWithdrawal(dataBaseAccountsExtras, user,value);
                    Screen.Meniu();
                    break ;
                case 3:
                    Screen.EnterAmount();
                    CashDeposit.operatieCashDeposit(dataBaseAccountsExtras, user,keypad.readFloat());
                    Screen.Meniu();
                    break ;
                case 4: flag = false; break ;


                default:
                    throw new IllegalStateException("Unexpected value: " + keypad.readInt());
            }
        }
    }
}
