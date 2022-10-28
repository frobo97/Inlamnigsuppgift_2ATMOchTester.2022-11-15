package org.example;

public class Accounts {
    /*
    Konto-klassen har ett kontonummer (String) och en summa pengar (int).
     */

    private String accountNumber;
    private int balanceOnAccount;

    public Accounts(String accountNumber, int balanceOnAccount) {
        this.accountNumber = accountNumber;
        this.balanceOnAccount = balanceOnAccount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalanceOnAccount() {
        return balanceOnAccount;
    }

    public void setBalanceOnAccount(int balanceOnAccount) {
        this.balanceOnAccount = balanceOnAccount;
    }

}
