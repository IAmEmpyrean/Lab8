import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    /**
     *
     */
    public enum BankAccountType {
        /**
         *
         */
        CHECKINGS,
        /**
         *
         */
        SAVINGS,
        /**
         *
         */
        STUDENT,
        /**
         *
         */
        WORKPLACE
    }

    /**
     *
     */
    private int accountNumber;
    /**
     *
     */
    @SuppressWarnings("checkstyle:visibilitymodifier")
    public BankAccountType accountType;
    /**
     *
     */
    private double accountBalance;
    /**
     *
     */
    private String ownerName;
    /**
     *
     */
    @SuppressWarnings("checkstyle:visibilitymodifier")
    public double interestRate;
    /**
     *
     */
    private double interestEarned;

    /**
     * @param name
     * \
     * @param accountCategory
     * \
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;
    }

    /**
     * @param name
     * \
     */
    public void setName(final String name) {
        ownerName = name;
    }
    /*
     * Implement getters and setters as appropriate for private variables.
     */
}