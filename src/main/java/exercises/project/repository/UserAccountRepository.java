package exercises.project.repository;

import exercises.project.model.Account;
import exercises.project.service.Teller;
import exercises.project.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class UserAccountRepository extends Teller {
    private Map<User, Account> userAccounts;

    public UserAccountRepository() {
    }

    @Autowired
    public UserAccountRepository(Map<User, Account> userAccounts) {
        this.userAccounts = userAccounts;
    }

    public void addUserAndAccount(User user, Account account) {
        userAccounts.put(user, account);
    }

    private void removeUser(User user) {
        userAccounts.remove(user);
    }

    private void removeAccount(Account account) {
        userAccounts.remove(account);
    }
}
