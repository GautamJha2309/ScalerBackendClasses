package Interfaces.V0;

public class FastTagRecharge {

    boolean recharge(YesBankAPI yesBankAPI, int amount) {
        if(amount <= yesBankAPI.getBalance("12")) {
            System.out.println("Recharge is successful...");
            return true;
        }
        System.out.println("Recharge is not successful...");
        return false;
    }
}
