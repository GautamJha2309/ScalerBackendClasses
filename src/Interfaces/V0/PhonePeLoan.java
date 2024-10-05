package Interfaces.V0;

public class PhonePeLoan {

    boolean checkEligibility(YesBankAPI yesBankAPI, int amount) {
        if(yesBankAPI.getBalance("12") > 0.2 * amount) {
            System.out.println("You are eligible");
            return true;
        }
        System.out.println("You are not eligible");
        return false;
    }
}
