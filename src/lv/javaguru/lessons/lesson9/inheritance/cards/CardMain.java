package lv.javaguru.lessons.lesson9.inheritance.cards;

import java.math.BigDecimal;

/**
 * Created by olegssedacs on 30/07/2017.
 */
public class CardMain {

    public static void main(String[] args) {
        Card debitCard = new DebitCard(new BigDecimal(100));
        Card overdraftCard = new OverdraftCard(new BigDecimal(20));

        for (int i = 0; i < 5; i++) {
            BigDecimal withdraw = overdraftCard.withdraw(new BigDecimal(18));
            System.out.println(withdraw);
        }
    }

}
