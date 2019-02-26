package example.java.design.patterns.principles.behavioral.command.bankaccount;

public class BankAccountCommand implements Command {

    private BankAccount bankAccount;
    private Action action;
    private double amount;
    private boolean successful;

    public BankAccountCommand(BankAccount bankAccount, Action action, double amount) {
        this.bankAccount = bankAccount;
        this.action = action;
        this.amount = amount;
    }

    public void call() {
        switch(action) {
            case DEPOSIT:
                successful = true;
                bankAccount.deposit(amount);
                break;
            case WITHDRAW:
                successful = bankAccount.withdraw(amount);
                break;
        }
    }

    public void undo() {

        switch (action) {
            case DEPOSIT:
                bankAccount.withdraw(amount);
                break;
            case WITHDRAW:
                if(successful)
                    bankAccount.deposit(amount);
                break;
        }
    }
}
