import java.math.BigDecimal;

public abstract class AbstractAccount {
    protected String name;
    protected BigDecimal balance;
    protected AccountType accountType;

    public AbstractAccount(String name, BigDecimal balance, AccountType accountType) {
        this.name = name;
        this.balance = balance;
        this.accountType = accountType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
