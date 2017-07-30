package lv.javaguru.lessons.lesson10;

import java.math.BigDecimal;

/**
 * Created by javastar on 7/30/2017.
 */
public class AccountMain {

    public static void main(String[] args) {
        Account account = new Account(new BigDecimal(-1));
        System.out.println(account.getBalance());
    }
}
