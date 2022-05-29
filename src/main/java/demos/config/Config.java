package demos.config;

import demos.model.Factory;
import demos.model.Window;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Configuration
@ComponentScan(basePackages = "demos.model")
public class Config {
    @Bean
    @Scope("prototype")
    public List<Window> windows() {
        return List.of(new Window(), new Window(), new Window(), new Window());
    }

    @Bean
    public Factory factory() {
        return new Factory();
    }
}
