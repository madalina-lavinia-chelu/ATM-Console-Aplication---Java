import java.util.HashMap;

public class Login {



    private static boolean validare(String numberA, String pinA, HashMap<String, Accounts> dataBaseAccountsExtras){


        return dataBaseAccountsExtras.containsKey(numberA);

    }


    /*static public boolean validare(Accounts accounts){

        return BankDatabase.getDataBaseAccounts().containsValue(Accounts.getPin()) &&
                BankDatabase.getDataBaseAccounts().containsValue(Accounts.getNumber());
    }*/

    static public String validareUser(HashMap<String, Accounts> dataBaseAccountsExtras){
        Keypad keypad = new Keypad();
        boolean userValid = false;
        System.out.println("Bine ai venit");
        System.out.println("Enter the credentials: ");
        while (!userValid){
            String user = keypad.readString();
            if(validare(user,keypad.readString(), dataBaseAccountsExtras) ){
                userValid = true;
                System.out.println("Successful login!");
                return user;
            }


            if(!userValid)
                System.out.println("Credentials are wrong. Try again.");
        }
        return null;

    }

}
