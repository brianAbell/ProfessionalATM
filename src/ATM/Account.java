package ATM;

import java.util.ArrayList;

/**
 * -Class which represents the account of a user.
 */
public class Account {
    /*
     * The name of the users account
     */
    private String name;

    /*
     * The balance of the users account
     */
    private double balance;

    /*
     * The users accounts unique id
     */
    private String uuid;

    /*
     * The name of the owner of the account
     */
    private String holder;

    /*
     * The list of transactions for the users account
     */
    private ArrayList<Transaction> transactions;

    //Constructor
    Account acc = new Account();
}
