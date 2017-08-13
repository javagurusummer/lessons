package lv.javaguru.lessons.lesson11.maps;

public class Card {

    private String number;
    private String accountNumber;

    public Card(String number, String accountNumber) {
        this.number = number;
        this.accountNumber = accountNumber;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
