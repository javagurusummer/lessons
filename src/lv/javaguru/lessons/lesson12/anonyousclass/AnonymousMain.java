package lv.javaguru.lessons.lesson12.anonyousclass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonymousMain {

    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("a"));
        accounts.add(new Account("d"));
        accounts.add(new Account("c"));
        accounts.add(new Account("g"));

        // anonymous class of interface Comparator
        accounts.sort(new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (Account account : accounts) {
            System.out.println(account.getName());
        }

        //aonymous class of class Account
        // NEVER DO THAT!
        Account overriden = new Account("x") {
            @Override
            public String getName() {
                return "asdfg";
            }
        };

        System.out.println(overriden.getName());
    }

}
