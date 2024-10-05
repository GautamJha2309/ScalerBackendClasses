package Interfaces.V1;

public class ICICIBankAPI implements BankAPI{
    public int balanceCheck(String accountNumber) {
        System.out.println("Getting Balance Via ICICI...");
        return 1000;
    }
}
