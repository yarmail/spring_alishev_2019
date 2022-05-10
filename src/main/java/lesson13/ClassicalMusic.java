package lesson13;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Классическая музыка";
    }
}

/*
В данном уроке ClassicalMusic
создадим автоматически
Через @ComponentScan в SpringConfig
и @Component в ClassicalMusic
 */

