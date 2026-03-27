package Inheritance_Assignment;

class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int acc, double bal) {
        this.accountNumber = acc;
        this.balance = bal;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;
    SavingsAccount(int acc, double bal, double rate) {
        super(acc, bal);
        this.interestRate = rate;
    }
    void displayAccountType() {
        System.out.println("Savings Account, Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;
    CheckingAccount(int acc, double bal, double limit) {
        super(acc, bal);
        this.withdrawalLimit = limit;
    }
    void displayAccountType() {
        System.out.println("Checking Account, Withdrawal Limit: $" + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int depositTerm;
    FixedDepositAccount(int acc, double bal, int term) {
        super(acc, bal);
        this.depositTerm = term;
    }
    void displayAccountType() {
        System.out.println("Fixed Deposit Account, Term: " + depositTerm + " months");
    }
}

public class BankTest {
    public static void main(String[] args) {
        BankAccount a1 = new SavingsAccount(1001, 5000, 3.5);
        BankAccount a2 = new CheckingAccount(1002, 3000, 1000);
        BankAccount a3 = new FixedDepositAccount(1003, 10000, 12);

        ((SavingsAccount)a1).displayAccountType();
        ((CheckingAccount)a2).displayAccountType();
        ((FixedDepositAccount)a3).displayAccountType();
    }
}
