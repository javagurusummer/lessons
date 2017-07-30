package lv.javaguru.lessons.lesson9.bank.accounts;

import java.math.BigDecimal;

/**
 * Created by olegssedacs on 30/07/2017.
 */
public abstract class BankAccount {

    private BigDecimal balance = BigDecimal.ZERO;

    public void deposit(BigDecimal balance) {
        if (balance.compareTo(BigDecimal.ZERO) > 0) {
            this.balance = this.balance.add(balance);
        }
    }

    public BigDecimal getBalance() {
        return balance;
    }

    protected void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
