package example.java.design.patterns.principles.behavioral.command.bankaccount;

public class BankAccountCommand implements Command {

    private final BankAccount bankAccount;
    private final Action action;
    private final int amount;

    public BankAccountCommand(BankAccount bankAccount, Action action, int amount) {
        this.bankAccount = bankAccount;
        this.action = action;
        this.amount = amount;
    }

    @Override
    public void call() {
        switch (action) {
            case DEPOSIT:
                bankAccount.deposit(amount);
                break;
            case WITHDRAW:
                bankAccount.withdraw(amount);
                break;
        }
    }

    @Override
    public void undo() {

    }
}
