package org.example;

public class Main {
    public static void main(String[] args) {

        ATM atm = new ATM();
        atm.run();

        atm.checkAccountBalance("f1234");
        atm.depositMoney("f1234", 1);
        atm.withdrawMoney("f1234",1);

    }
}

