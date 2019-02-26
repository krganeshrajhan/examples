package example.java.design.patterns.principles.behavioral.command.bankaccount;


public class BankAccount {

    private double balance;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: "+amount+" , balance: "+balance);
    }

    public boolean withdraw(double amount) {
        if(balance>=amount) {
            balance -= amount;
            System.out.println("Withdrawn: "+amount+" , balance: "+balance);
            return true;
        }
        return false;
    }

    public String toString() {
        return "Balance: "+balance;
    }
}
