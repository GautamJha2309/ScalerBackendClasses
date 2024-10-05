package Interfaces.V1;

import java.util.Scanner;

public class Client {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //-------------------------------------------------------------------------------------------
        //          Dependence Injection
        String bankName = scanner.nextLine();
        BankAPI bankAPI = null;
        if(bankName.equals("Yes Bank")) {
            bankAPI = new YesBankAPI();
        } else if (bankName.equals("ICICI")) {
            bankAPI = new ICICIBankAPI();
        }
        PhonePe phonePe = new PhonePe(bankAPI);


        phonePe.rechargeFastTag(1000);
    }
}
