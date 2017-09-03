package lv.javaguru.lessons.lesson12.treemap;

public class User implements Comparable<User> {

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

    @Override
    public int compareTo(User o) {
        return getUserStatus().compareTo(o.getUserStatus());
    }
}
