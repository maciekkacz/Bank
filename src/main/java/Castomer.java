import java.util.List;

public class Castomer {
    private long id;
    private String name;
    private String surname;
    List<AbstractAccount> accounts;

    public Castomer(long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<AbstractAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<AbstractAccount> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "Castomer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
