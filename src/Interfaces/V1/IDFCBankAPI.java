package Interfaces.V1;

public class IDFCBankAPI implements BankAPIV1{


    @Override
    public void setPIN(String PIN) {
        System.out.println("New PIN Confirmed...");
    }

    @Override
    public int balanceCheck(String accountNumber) {
        return 0;
    }
}
