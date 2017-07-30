package lv.javaguru.lessons.lesson9.inheritance.accounts;

import java.math.BigDecimal;

/**
 * Created by olegssedacs on 30/07/2017.
 */
public class CurrentAccount extends BankAccount implements Withdrawable {

    @Override
    public BigDecimal withdraw(BigDecimal amount) {
        if (getBalance().compareTo(amount) >= 0) {
            setBalance(getBalance().subtract(amount));
        }
        return amount;
    }

}
