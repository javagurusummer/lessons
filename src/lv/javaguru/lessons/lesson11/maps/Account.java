package lv.javaguru.lessons.lesson11.maps;

import lv.javaguru.lessons.lesson11.Assert;

public class Account {

    private final String number;
    private String name;

    public Account(String name, String number) {
        Assert.notNullOrEmpty(number, "number");
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        return number != null ? number.equals(account.number) : account.number == null;
    }

    @Override
    public int hashCode() {
        return number != null ? number.hashCode() : 0;
    }
}
