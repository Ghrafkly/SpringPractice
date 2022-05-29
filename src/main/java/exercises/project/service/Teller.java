package exercises.project.service;

import exercises.project.model.Account;
import exercises.project.model.User;
import exercises.project.repository.AccountRepository;
import exercises.project.repository.UserAccountRepository;
import exercises.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class Teller {
    private AccountRepository accountRepository;
    private UserRepository userRepository;
    private UserAccountRepository userAccountRepository;

    public Teller() {
    }

    @Autowired
    public Teller(AccountRepository accountRepository, UserRepository userRepository, UserAccountRepository userAccountRepository) {
        this.accountRepository = accountRepository;
        this.userRepository = userRepository;
        this.userAccountRepository = userAccountRepository;
    }

    public void addUser(User user) {
        userRepository.addUser(user);
    }

    public void addAccount(Account account) {
        accountRepository.addAccount(account);
    }

    public void addUserAndAccount(User user, Account account) {
    }
}
