package Interfaces.V1;

public class FastTagRecharge {

    boolean recharge(BankAPI bankAPI, int amount) {
        if(amount <= bankAPI.balanceCheck("12")) {
            System.out.println("Recharge is successful...");
            return true;
        }
        System.out.println("Recharge is not successful...");
        return false;
    }
}
