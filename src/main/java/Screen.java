import java.util.Timer;

public class Screen {

    public static void Meniu(){
        System.out.println("************************************");
        System.out.println("**      Type 1 - View Balance     **");
        System.out.println("**      Type 2 - Withdraw         **");
        System.out.println("**      Type 3 - Deposit          **");
        System.out.println("**      Type 4 - Exit             **");
        System.out.println("************************************");
    }
    public void ViewBalanceScreen(){
        System.out.println();
        System.out.println("************************************");
        System.out.println("            View Balance            ");
        System.out.println("My balance: ");
        System.out.println("************************************");

    }
    public static void amountWithDrawal(){
        System.out.println("Possibility to withdraw 20$, 40$, 60$, 100$, 200$");
    }
    public static void IllegalOperation(){
        System.out.println("Illegal operation");
    }

    public static void EnterAmount(){
        System.out.println("Enter amount");
    }




}
