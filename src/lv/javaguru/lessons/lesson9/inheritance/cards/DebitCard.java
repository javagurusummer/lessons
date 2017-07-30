package lv.javaguru.lessons.lesson9.inheritance.cards;

import java.math.BigDecimal;

/**
 * Created by olegssedacs on 30/07/2017.
 */
public class DebitCard extends Card {

    public DebitCard(BigDecimal balance) {
        super(balance);
    }

    @Override
    protected boolean validateWithdraw(BigDecimal amount) {
        return getBalance().compareTo(amount) >= 0;
    }
}
