package lv.javaguru.lessons.lesson9.inheritance.cards;

import java.math.BigDecimal;

/**
 * Created by olegssedacs on 30/07/2017.
 */
public abstract class Card {

    private BigDecimal balance;

    public Card(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal withdraw(BigDecimal amount) {
        if (validateWithdraw(amount)) {
            balance = balance.subtract(amount);
            return amount;
        }
        return BigDecimal.ZERO;
    }

    protected abstract boolean validateWithdraw(BigDecimal amount);

    public BigDecimal getBalance() {
        return balance;
    }
}
