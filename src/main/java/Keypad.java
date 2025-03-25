import java.util.*;
import lombok.*;

@Getter
@Setter

@EqualsAndHashCode
@ToString

public class Keypad {
    //Un bancomat folosește un ecran pentru a afișa mesaje și o tastatură pentru interacțiune
    Scanner scanner = new Scanner(System.in);
    public Keypad(){
    }


    private void setUser1(Accounts a){

        a.setNumber(scanner.nextLine());
        a.setPin(scanner.nextLine());
    }

    public int readInt(){
        return scanner.nextInt();
    }
    public String readString(){
        return scanner.nextLine();
    }
    public float readFloat(){
        return scanner.nextFloat();
    }











}