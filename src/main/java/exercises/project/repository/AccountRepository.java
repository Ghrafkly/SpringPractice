package exercises.project.repository;

import exercises.project.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class AccountRepository {
    private Map<Long, Account> accounts;

    public AccountRepository() {
    }

    @Autowired
    public AccountRepository(Map<Long, Account> accounts) {
        this.accounts = accounts;
    }

    public void addAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account.getAccountNumber());
    }
}
