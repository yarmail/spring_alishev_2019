package lesson13;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan
@PropertySource("classpath:lesson13.properties")
public class SpringConfig {
    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }
    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(rockMusic());
    }
}

/*
@Configuration
файл конфигурации - вместо xml
---
@ComponentScan("") - путь для наших компонентов
@ComponentScan - локально
---
@PropertySource("classpath:lesson13.properties") -
путь для параметров из внешнего файла
---
Вручную: создание бинов и внедрение
    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

 */
