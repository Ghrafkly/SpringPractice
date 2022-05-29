package demos;

import demos.config.Config;
import demos.model.Car;
import demos.model.Engine;
import demos.model.Factory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Car car = context.getBean(Car.class);
        Engine engine = context.getBean(Engine.class);
        Factory factory = context.getBean(Factory.class);

        System.out.println(car);
        System.out.println(engine);
        System.out.println(factory);

        context.close();
    }
}
