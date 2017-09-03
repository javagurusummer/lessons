package lv.javaguru.lessons.lesson13.pair;

import java.util.ArrayList;
import java.util.List;

public class PairMain {

    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("+37120202020"));
        accounts.add(new Account("+79297263730"));
        accounts.add(new Account("+37192929292"));

        for (Pair<Account, Integer> pair : findLativanAccounts(accounts)) {
            System.out.println(pair);
        }
    }

    private static List<Pair<Account, Integer>> findLativanAccounts(List<Account> accounts) {
        List<Pair<Account, Integer>> pairs = new ArrayList<>();
        for (int i = 0; i < accounts.size(); i++) {
            Account a = accounts.get(i);
            if (a.getPhone().startsWith("+371")) {
                pairs.add(new Pair<>(a, i));
            }
        }
        return pairs;
    }

    public static class Account {
        private String phone;

        public Account(String phone) {
            this.phone = phone;
        }

        public String getPhone() {
            return phone;
        }

        @Override
        public String toString() {
            return "Account{" +
                    "phone='" + phone + '\'' +
                    '}';
        }
    }

}
