package bankOfSimbaApp;

import java.util.ArrayList;
import java.util.List;

public class Users extends Account {

    public static List<Account> listOfUsers = new ArrayList<>();


    public Users() {
        listOfUsers.add(new Account("Simba", 2000, "lion","good"));
        listOfUsers.get(0).isKing = true;
        listOfUsers.add(new Account("Mustafa", 10000, "lion", "good"));
        listOfUsers.add(new Account("Scar", 5000, "lion", "bad"));
        listOfUsers.add(new Account("Nala", 7500, "lion", "good"));
        listOfUsers.add(new Account("Timon", 10000, "meercat", "good"));
        listOfUsers.add(new Account("Pumba", 10000, "boar", "good"));
    }

    public List<Account> getListOfUsers() {
        return listOfUsers;
    }

    public static Account getUser(String userName) {
        for (Account user: listOfUsers
             ) {
            if (user.getName().equalsIgnoreCase(userName)) {
                return user;
            }
        }
        return null;
    }

    public void setListOfUsers(List<Account> listOfUsers) {
        this.listOfUsers = listOfUsers;
    }
}
