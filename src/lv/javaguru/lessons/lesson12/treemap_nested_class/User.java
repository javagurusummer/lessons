package lv.javaguru.lessons.lesson12.treemap_nested_class;

import java.util.Comparator;

public class User {

    private String username;
    private UserStatus userStatus;

    public User(String username, UserStatus userStatus) {
        this.username = username;
        this.userStatus = userStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return username != null ? username.equals(user.username) : user.username == null;
    }

    @Override
    public int hashCode() {
        return username != null ? username.hashCode() : 0;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserStatus getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus;
    }

    public enum UserStatus {
        ACTIVE, SUSPENDED, TEMPORARY_BLOCKED, BLOCKED, DELETED;
    }

    public static class UsernameComparator implements Comparator<User> {

        @Override
        public int compare(User o1, User o2) {
            return o1.getUsername().compareTo(o2.getUsername());
        }
    }

}
