package lv.javaguru.lessons.lesson11.enums;

public class Account {

    private String name;
    private String email;
    private AccountStatus status;
    private Day registrationDay;
    private Currency currency;

    public Account(String name,
                   String email,
                   AccountStatus status,
                   Day registrationDay,
                   Currency currency) {
        this.name = name;
        this.email = email;
        this.status = status;
        this.registrationDay = registrationDay;
        this.currency = currency;
    }

    public void block() {
        status = AccountStatus.BLOCKED;
    }
}
