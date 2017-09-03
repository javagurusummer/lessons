package lv.javaguru.lessons.lesson12.treemap_nested_class;

import java.util.Map;
import java.util.TreeMap;

public class UserMain {

    public static void main(String[] args) {
        Map<User, Integer> users = new TreeMap<>(new User.UsernameComparator());

        users.put(new User("a", User.UserStatus.ACTIVE), 0);
        users.put(new User("b", User.UserStatus.ACTIVE), 1);
        users.put(new User("v", User.UserStatus.BLOCKED), 2);
        users.put(new User("x", User.UserStatus.DELETED), 3);

        System.out.println(users.size());
    }

}
