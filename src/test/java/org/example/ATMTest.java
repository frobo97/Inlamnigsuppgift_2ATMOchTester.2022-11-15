package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest {

    private ATM atm;
    @BeforeEach
    void setUp() {
      atm = new ATM();
        atm.defaultUsers();

    }
//    @org.junit.jupiter.api.AfterEach
//    void tearDown() {
//    }
//    @org.junit.jupiter.api.Test
//    void logIn() {
//    }
//    @org.junit.jupiter.api.Test
//    void checkAccountBalance() {
//    }
//    @org.junit.jupiter.api.Test
//    void depositMoney() {
//    }
//    @org.junit.jupiter.api.Test
//    void withdrawMoney() {
//    }

    @Test
    public void logInTest_NonExistingUser(){
        User falseUser = new User("pelle", "per", null);
        User result = atm.logIn(falseUser);
        assertNull(result);
    }

    @Test
    public void logInTest_ExistingUser(){
        User trueUser = new User("frode", "123", null);
        User result = atm.logIn(trueUser);
        assertEquals(result.getName(), trueUser.getName());
        assertEquals(result.getPassword(), trueUser.getPassword());

    }


    @Test
    public void logInTest_ExistingUserWrongPassword(){
        User userIncorrectPassword = new User("frode", "incorrect", null);
        User result = atm.logIn(userIncorrectPassword);
        assertNull(result);
    }


}