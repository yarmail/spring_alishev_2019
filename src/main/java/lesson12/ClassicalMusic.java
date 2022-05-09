package lesson12;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInit() {
        System.out.println("делаю Init метод");
    }

    @Override
    public String getSong() {
        return "Классическая музыка";
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("делаю Destroy метод");
    }
}

