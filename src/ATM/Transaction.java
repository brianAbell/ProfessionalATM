package ATM;

import java.sql.Date;
import java.util.ArrayList;

/**
 * -Class which represents the transactions of an account.
 */
public class Transaction {
    /**
     * The amount of a transaction.
     */
    private Double amount;

    /**
     * The time stamp of a transaction.
     */
    private Date timeStamp;

    /**
     * A memo for this transaction.
     */
    private String memo;

    /**
     * The account in which this transaction occurred.
     */
    private Account inAccount;

}
