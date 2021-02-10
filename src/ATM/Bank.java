package ATM;

import java.util.ArrayList;

/**
 * -A class which represents a bank.
 */
public class Bank {
    /**
     * The name of the bank.
     */
    private String name;

    /**
     * A list of users associated with this bank.
     *
     * Type -> user
     */
    private ArrayList<User> user;

    /**
     * A list of accounts in this bank
     */
    private ArrayList<Account> accounts;

}
