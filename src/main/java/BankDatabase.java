
import java.util.HashMap;
import lombok.*;

@ToString

public class BankDatabase {
    //bază de date bancară care conține Conturile

    static HashMap<String, Accounts> dataBaseAccounts = new HashMap<String, Accounts>();

    public static HashMap<String, Accounts> getDataBaseAccounts() {
        Accounts accounts1 = new Accounts("number1", "pin1", 123.0F, "Ioana Stroie");
        Accounts accounts2 = new Accounts("number2", "pin2", 121.0F, "Maria Rev");
        Accounts accounts3 = new Accounts("number3", "pin3", 80.0F, "Marius Tec");
        Accounts accounts4 = new Accounts("number4", "pin4", 10021.0F,"Ana Pev");


        dataBaseAccounts.put(accounts1.getNumber(), accounts1);
        dataBaseAccounts.put(accounts2.getNumber(), accounts2);
        dataBaseAccounts.put(accounts3.getNumber(), accounts3);
        dataBaseAccounts.put(accounts4.getNumber(), accounts4);
        return dataBaseAccounts;
    }





}
