package Interfaces.V0;

public class PhonePe {

    private YesBankAPI yesBankAPI;
    private FastTagRecharge fastTagRecharge;
    private PhonePeLoan phonePeLoan;

    public PhonePe() {
        yesBankAPI = new YesBankAPI();
        fastTagRecharge = new FastTagRecharge();
        phonePeLoan = new PhonePeLoan();
    }

    boolean rechargeFastTag(int amount) {
        return fastTagRecharge.recharge(yesBankAPI, amount);
    }

    boolean availLone(int amount) {
        return phonePeLoan.checkEligibility(yesBankAPI,amount);
    }
}
