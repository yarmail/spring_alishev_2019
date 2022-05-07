package lesson09;

import org.springframework.stereotype.Component;

@Component ("musicBean")
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Классическая музыка";
    }
}

/*
Рядом с анотацией @Component можно указать
id создаваемого бина
@Component ("nameOfBean")
Если не указывать - тогда название бина будет -
"название_класса_с_маленькой_буквы"
 */