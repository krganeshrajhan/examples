package example.java.design.patterns.principles.behavioral.command.bankaccount;


import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class BankAccountMain {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        List<BankAccountCommand> bankAccountCommandList = new ArrayList<>();
        bankAccountCommandList.add(new BankAccountCommand(bankAccount, Action.DEPOSIT,100));
        bankAccountCommandList.add(new BankAccountCommand(bankAccount, Action.WITHDRAW, 50));
        bankAccountCommandList.add(new BankAccountCommand(bankAccount, Action.WITHDRAW, 1000));

        bankAccountCommandList.stream().forEach(a -> a.call());
        Collections.reverse(bankAccountCommandList);
        bankAccountCommandList.stream().forEach(a -> a.undo());
    }
}
