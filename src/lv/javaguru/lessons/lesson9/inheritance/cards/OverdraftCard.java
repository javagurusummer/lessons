package lv.javaguru.lessons.lesson9.inheritance.cards;

import java.math.BigDecimal;

/**
 * Created by olegssedacs on 30/07/2017.
 */
public class OverdraftCard extends DebitCard {

    private BigDecimal overdraft;

    public OverdraftCard(BigDecimal balance) {
        super(balance);
        this.overdraft = new BigDecimal("50");
    }

    @Override
    protected boolean validateWithdraw(BigDecimal amount) {
        return super.validateWithdraw(amount)
                || getBalance().add(overdraft).compareTo(amount) >= 0;
    }
}
