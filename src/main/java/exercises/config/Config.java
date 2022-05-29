package exercises.config;

import exercises.project.model.Account;
import exercises.project.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@ComponentScan(basePackages = "exercises.project")
public class Config {
    @Bean
    public Map<User, Account> userAccounts() {
        HashMap<User, Account> userAccounts = new HashMap<>();
        userAccounts.put(new User(), new Account());
        return userAccounts;
    }

    @Bean
    public Map<Long, Account> accounts() {
        HashMap<Long, Account> accounts = new HashMap<>();
        accounts.put(1L, new Account());
        return accounts;
    }

    @Bean
    public Map<Long, User> users() {
        HashMap<Long, User> users = new HashMap<>();
        users.put(1L, new User());
        return users;
    }
}
