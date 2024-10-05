package Interfaces.V1;

public class PhonePe {

    //private YesBankAPI yesBankAPI; not needed as we implemented BankAPI Interface
    private BankAPI bankAPI;
    private FastTagRecharge fastTagRecharge;
    private PhonePeLoan phonePeLoan;

    public PhonePe(BankAPI bankAPI) {
        //yesBankAPI = new YesBankAPI();    Not needed as we implemented BankAPI Interface
        this.bankAPI = bankAPI; // Dependency Injection
        fastTagRecharge = new FastTagRecharge();
        phonePeLoan = new PhonePeLoan();
    }

    boolean rechargeFastTag(int amount) {
        return fastTagRecharge.recharge(bankAPI, amount);
    }

    boolean availLone(int amount) {
        return phonePeLoan.checkEligibility(bankAPI,amount);
    }
}
