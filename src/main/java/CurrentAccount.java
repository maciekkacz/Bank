import java.math.BigDecimal;

public class CurrentAccount extends AbstractAccount {

    public CurrentAccount() {
        super();
        this.accountType = AccountType.CURRENT;
    }

    public CurrentAccount(String number, BigDecimal balance, AccountType accountType) {
        super(number, balance, accountType);
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                ", accountType=" + accountType +
                '}';
    }
}
