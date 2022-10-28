package org.example;

public class Main {
    public static void main(String[] args) {

        ATM atm = new ATM();
        atm.run();

        atm.checkAccountBalance("j1234");
        atm.depositMoney("j1234", 1);
        atm.withdrawMoney("j1234",101);

    }
}

