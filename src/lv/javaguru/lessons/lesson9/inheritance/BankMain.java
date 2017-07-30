package lv.javaguru.lessons.lesson9.inheritance;

import lv.javaguru.lessons.lesson9.inheritance.accounts.BankAccount;
import lv.javaguru.lessons.lesson9.inheritance.accounts.CurrentAccount;
import lv.javaguru.lessons.lesson9.inheritance.accounts.MortgageAccount;
import lv.javaguru.lessons.lesson9.inheritance.accounts.Withdrawable;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by olegssedacs on 30/07/2017.
 */
public class BankMain {

    public static void main(String[] args) {
        CurrentAccount currentAccount = new CurrentAccount();
        MortgageAccount mortgageAccount = new MortgageAccount();

        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(currentAccount);
        accounts.add(mortgageAccount);

        printBanalnces(accounts);

        applyCommission(new BigDecimal("23"), accounts);
    }

    public static void printBanalnces(List<BankAccount> accounts) {
        for (BankAccount account : accounts) {
            System.out.printf("Balance = %s", account.getBalance());
        }
    }

    public static void applyCommission(BigDecimal commission, List<BankAccount> accounts) {
        for (BankAccount account : accounts) {
            if (account instanceof Withdrawable) {
                Withdrawable withdrawable = (Withdrawable) account;
                withdrawable.withdraw(commission);
            }
        }
    }

}
