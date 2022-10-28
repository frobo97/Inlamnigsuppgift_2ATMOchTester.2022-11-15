package org.example;

import java.util.*;

public class ATM {

 /*
    Bankomat-klassen (ATM) har en lista av användare (ArrayList<User>),
    ett Bank-objekt (Bank) och ett enskilt användare-objekt som är ”just nu inloggad” (User).
*/

    // linstan users = Linus bankUsers
    private List<User> users = new ArrayList<>();
    private List<Accounts> masterAccounts = new ArrayList<>();

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }

    User currentUser;
    User userTryingToLogin;
    Bank bank = new Bank();  // detta bara för att uppgiften säger det

    public void defaultUsers() {
        List<Accounts> frodeAccounts = new ArrayList<>();
        frodeAccounts.add(new Accounts("f123", 100));
        frodeAccounts.add(new Accounts("f1234", 999));
        User user = new User("frode", "123", frodeAccounts);
        users.add(user);

        List<Accounts> jensenAccounts = new ArrayList<>();
        jensenAccounts.add(new Accounts("j123", 10));
        jensenAccounts.add(new Accounts("j1234", 99));
        User user2 = new User("jensen", "789", jensenAccounts);
        users.add(user2);

    }

    public void run() {  //klar 2022-10-26
    /*
    Bankomaten har funktionen Run(). I denna kan användaren välja olika
    val. Först skall de logga in.
     */
        defaultUsers();

        String userName = ScannerBoy.getString("Enter Username");
        String password = ScannerBoy.getString("Enter Password");
        currentUser = logIn(new User(userName, password, null));
        if (currentUser == null) {
            System.out.println("Incorrect password or Username");
            System.exit(-1);
        } else {
            System.out.println("vi lyckades\n" + currentUser.getName());
        }
    }


    public User logIn(User logIn) {  //klar 2022-10-26
        /*
        Bankomaten skall ha en LogIn() funktion. Användaren skriver in ett
        användarnamn (String) och lösenord (String), och ifall de stämmer med
        en användare i listan av användare så blir personen inloggad
         */
        for (User userTryingToLogin : users) {
            if (userTryingToLogin.getName().equals(logIn.getName())) {
                if (userTryingToLogin.getPassword().equals(logIn.getPassword())) {
                    return userTryingToLogin;
                } else {
                    System.out.println("fail");
                }
            }
        }
        return null;
    }

    public int checkAccountBalance(String accountNumber) {
        /*
        Bankomaten skall ha CheckAccountBalance() funktion, som tar en string.
        Den skall då gå igenom de konton som användaren har, och har de ett
        konto som har det konto-nummer som efterfrågas så ges det tillbaka hur
        mycket pengar är i detta konto.
         */
        // cUAN --> currentUserAccountNumber
        for (Accounts cUAN : currentUser.getAccountList()) {
            if (cUAN.getAccountNumber().equals(accountNumber)) {
                System.out.println("test " + cUAN.getAmountOnAccount());
                return cUAN.getAmountOnAccount();
            }
        }
        return 0;
    }

    public int depositMoney(String accountNumber, int depositAmount) {
        /*
        Bankomaten skall ha en DepositMoney() funktion, som tar en string som
        är kontonumret och en int som är hur mycket man vill lägga in i detta
        konto. Kolla om inskickade kontonumret är någon av de tillgängliga och
        lägg in detta värde i detta konto.
         */
        // cUAN --> currentUserAccountNumber
        for (Accounts cUAN : currentUser.getAccountList()) {
            if (cUAN.getAccountNumber().equals(accountNumber)) {
                cUAN.setAmountOnAccount(cUAN.getAmountOnAccount() + depositAmount);
                System.out.println("test " + cUAN.getAmountOnAccount());
                return cUAN.getAmountOnAccount();
            }
        }
        return 0;
    }


    public int withdrawMoney(String accountNumber, int withdrawAmount) {
        /*
        Bankomaten skall ha en WithdrawMoney() funktion, som tar en string
        som är kontonumret och en int som är hur mycket pengar man vill
        hämta. Om nuvarande inloggad användare har detta konto och kontot
        innehåller tillräckligt med pengar skall detta hämtas
         */
        // cUAN --> currentUserAccountNumber
        for (Accounts cUAN : currentUser.getAccountList()) {
            if (cUAN.getAccountNumber().equals(accountNumber)) {
                if (withdrawAmount <= cUAN.getAmountOnAccount()) {
                    cUAN.setAmountOnAccount(cUAN.getAmountOnAccount() - withdrawAmount);
                    System.out.println("test " + cUAN.getAmountOnAccount());
                    return cUAN.getAmountOnAccount();
                } else {
                    System.out.println("Insufficient funds on account\n" +
                            "Funds available = " + cUAN.getAmountOnAccount());
                }
            }
        }
        return 0;
    }

}
