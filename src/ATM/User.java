package ATM;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/**
 * -A class which represents the user.
 */
public class User {
    // (private --> member only visible within the class)

    /*
      The users first name
     */
    private final String firstName;

    /*
      The users last name
     */
    private final String lastName;

    /*
      The users unique id
     */
    private String uuid;

    // (MD5 --> hash function producing a 128-bit hash value)
    // (Q: why store hash instead of value?)
    /*
      The MD5 hash of the user's pin number
     */
    private byte[] pinHash;

    //** (Array List --> a resizable array)
    /*
      list of user accounts
     */
    private ArrayList<Account> accounts;

    /*
    User constructor
     */
    public User(String firstN, String lastN, String pin, Bank bank) {
        //set the name of user
        this.firstName = firstN;
        this.lastName = lastN;

        //store the pin's MD5 hash, rather than original value. (reason: security)
        //NOTE: java doesnt know string before hand so we must use exception handling
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            System.err.println("error occurred, caught NoSuchAlgorithmException");
            e.printStackTrace();
            System.exit(1);
        }


    }


}
