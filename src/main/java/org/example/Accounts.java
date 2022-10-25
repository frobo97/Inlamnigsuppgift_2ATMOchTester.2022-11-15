package org.example;

public class Accounts {
    /*
    Konto-klassen har ett kontonummer (String) och en summa pengar (int).
     */

    private String accountNumber;
    private String userNameForAccount;
    private int amountOnAccount;

    public Accounts(String accountNumber, String userNameForAccount, int amountOnAccount) {
        this.accountNumber = accountNumber;
        this.userNameForAccount = userNameForAccount;
        this.amountOnAccount = amountOnAccount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAmountOnAccount() {
        return amountOnAccount;
    }

    public void setAmountOnAccount(int amountOnAccount) {
        this.amountOnAccount = amountOnAccount;
    }

    public String getUserNameForAccount() {
        return userNameForAccount;
    }

    public void setUserNameForAccount(String userNameForAccount) {
        this.userNameForAccount = userNameForAccount;
    }
}
