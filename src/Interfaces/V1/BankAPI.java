package Interfaces.V1;

public interface BankAPI {

    int balanceCheck(String accountNumber);
}

// Whoever wants to be a UPI provider bank, they should have to implement these methods

// we can use interface as a type