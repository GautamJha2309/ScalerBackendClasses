package Interfaces.V1;

public class PhonePeLoan {

    boolean checkEligibility(BankAPI bankAPI, int amount) {
        if(bankAPI.balanceCheck("12") > 0.2 * amount) {
            System.out.println("You are eligible");
            return true;
        }
        System.out.println("You are not eligible");
        return false;
    }
}
