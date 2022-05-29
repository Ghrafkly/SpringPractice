package demos.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope("prototype")
public class Car {
    private Engine engine;
    private List<Window> window;
    private Factory factory;

    public Car() {
    }

    @Autowired
    public Car(Engine engine, List<Window> window, Factory factory) {
        this.engine = engine;
        this.window = window;
        this.factory = factory;
    }

    // getters and setters
    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public List<Window> getWindow() {
        return window;
    }

    public void setWindow(List<Window> window) {
        this.window = window;
    }

    public Factory getFactory() {
        return factory;
    }

    public void setFactory(Factory factory) {
        this.factory = factory;
    }

    // to String
    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", window=" + window +
                ", factory=" + factory +
                '}';
    }
}
