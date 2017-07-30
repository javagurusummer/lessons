package lv.javaguru.lessons.lesson9.bank.accounts;

import java.math.BigDecimal;

/**
 * Created by olegssedacs on 30/07/2017.
 */
public interface Withdrawable {

    BigDecimal withdraw(BigDecimal amount);

}
