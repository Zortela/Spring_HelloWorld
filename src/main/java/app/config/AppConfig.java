package app.config;

import app.model.Cat;
import app.model.Dog;
import app.model.Timer;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {

    @Bean(name = "cat")
    public Cat getCat () {
        Cat cat = new Cat();
        return cat;
    }

    @Bean(name = "dog")
    public Dog getDog () {
        Dog dog = new Dog();
        return dog;
    }

    @Bean(name = "timer")
    public Timer getTimer() {
        Timer timer = new Timer();
        return timer;
    }

}
