package bankOfSimbaApp;

import java.util.ArrayList;
import java.util.List;

public class Users extends Account {

    public List<Account> listOfUsers = new ArrayList<>();


    public Users() {
        listOfUsers.add(new Account("Simba", 2000, "lion"));
        listOfUsers.get(0).isKing = true;
        listOfUsers.add(new Account("Mustafa", 10000, "lion"));
        listOfUsers.add(new Account("Scar", 5000, "lion"));
        listOfUsers.add(new Account("Nala", 7500, "lion"));
        listOfUsers.add(new Account("Timon", 10000, "meercat"));
        listOfUsers.add(new Account("Pumba", 10000, "boar"));
    }

    public List<Account> getListOfUsers() {
        return listOfUsers;
    }

    public void setListOfUsers(List<Account> listOfUsers) {
        this.listOfUsers = listOfUsers;
    }
}
