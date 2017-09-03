package lv.javaguru.lessons.lesson12.treemap;

import java.util.Map;
import java.util.TreeMap;

public class UserMain {

    public static void main(String[] args) {
        Map<User, Integer> users = new TreeMap<>(new UsernameComparator());

        users.put(new User("a", UserStatus.ACTIVE), 0);
        users.put(new User("b", UserStatus.ACTIVE), 1);
        users.put(new User("v", UserStatus.BLOCKED), 2);
        users.put(new User("x", UserStatus.DELETED), 3);

        System.out.println(users.size());
    }

}
