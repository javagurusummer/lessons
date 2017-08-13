package lv.javaguru.lessons.lesson11.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountsMain {


    public static void main(String[] args) {
        Account vasja = new Account("Vasja", "001");
        Account tolja = new Account("Tolja", "002");

        Card c0 = new Card("055936353", "001");
        Card c1 = new Card("93736363", "001");
        Card c2 = new Card("93736363", "002");
        Map<Account, List<Card>> accountAndCards = new HashMap<>();
        addCard(accountAndCards, c0, vasja);
        addCard(accountAndCards, c1, vasja);
        addCard(accountAndCards, c2, tolja);

        List<Card> toljasCards = accountAndCards.remove(tolja);
        tolja.setName("jdjdjd");
        accountAndCards.put(tolja, toljasCards);

        List<Card> cards = accountAndCards.get(tolja);
        System.out.println(accountAndCards.size());
    }

    public static void addCard(Map<Account, List<Card>> map, Card card, Account account) {
        List<Card> cards = map.get(account);
        if (cards == null) {
            cards = new ArrayList<>();
            cards.add(card);
            map.put(account, cards);
        } else {
            cards.add(card);
        }
    }


}
