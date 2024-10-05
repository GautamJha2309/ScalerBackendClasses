package Interfaces.V1;

public class YesBankAPI implements BankAPI {


    public int balanceCheck(String accountNumber) {
        System.out.println("Getting Balance Via YesBank...");
        return 1000;
    }
}


// We can use Interface as a Type
// as  (Animal x = new Dog();)
// Interface y = new ClassWhichImplementThisInterface;
// Example:
// BankAPI x = new YesBank();