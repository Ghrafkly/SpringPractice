package exercises;

import exercises.config.Config;
import exercises.project.model.User;
import exercises.project.repository.UserRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        UserRepository userRepository = context.getBean(UserRepository.class);
        User user = new User("John", 1L);
        userRepository.addUser(user);
        System.out.println(userRepository.getUser(1L));

        context.close();
    }
}
