import java.math.BigDecimal;

public abstract class AbstractAccount {
    protected String number;
    protected BigDecimal balance;
    protected AccountType accountType;

    public AbstractAccount(String number, BigDecimal balance, AccountType accountType) {
        this.number = number;
        this.balance = balance;
        this.accountType = accountType;
    }

    public AbstractAccount() {
        this.number = "" + System.nanoTime();
        this.balance = BigDecimal.ZERO;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
}
