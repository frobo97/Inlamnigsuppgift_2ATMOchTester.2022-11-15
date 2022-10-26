package org.example;

import java.util.ArrayList;
import java.util.List;

public class User {
    /*
    Användare-klassen har ett namn (String),
    ett lösenord (String) och en lista av konton (Account).
     */

    private String userName;
    private String password;
    private List<Accounts> accountList;


    public User(String userName, String password, List<Accounts> accountList) {
        this.userName = userName;
        this.password = password;
        this.accountList = accountList;
    }

    public String getName() {
        return userName;
    }

    public void setName(String name) {
        this.userName = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Accounts> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Accounts> accountList) {
        this.accountList = accountList;
    }
}
