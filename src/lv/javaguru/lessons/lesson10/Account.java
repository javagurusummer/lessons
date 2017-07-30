package lv.javaguru.lessons.lesson10;

import java.math.BigDecimal;

/**
 * Created by javastar on 7/30/2017.
 */
public class Account {

    private BigDecimal balance;

    public Account(BigDecimal startBalance) {
        if (startBalance.compareTo(BigDecimal.ZERO) < 0) {
            throw new RuntimeException("balance must be positive");
        } else {
            balance = startBalance;
        }
    }

    public BigDecimal getBalance() {
        return balance;
    }
}
