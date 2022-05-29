package exercises.project.repository;

import exercises.project.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class UserRepository {
    private Map<Long, User> users;

    public UserRepository() {
    }

    @Autowired
    public UserRepository(Map<Long, User> users) {
        this.users = users;
    }

    public void addUser(User user) {
        users.put(user.getId(), user);
    }

    public void removeUser(User user) {
        users.remove(user.getId());
    }

    public User getUser(Long id) {
        return users.get(id);
    }
}
