import java.util.ArrayList;

public class Helper {
    static boolean validateAmount(float amount){
        ArrayList<Float> validAmounts = new ArrayList<>();
        validAmounts.add(20.0F);
        validAmounts.add(40.0F);
        validAmounts.add(60.0F);
        validAmounts.add(100.0F);
        validAmounts.add(200.0F);



        return validAmounts.contains(amount);

    }
}

