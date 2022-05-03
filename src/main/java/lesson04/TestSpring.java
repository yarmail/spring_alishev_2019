package lesson04;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("lesson04.xml");
        Music music = context.getBean("musicBean", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();
        context.close();
    }
}
/*
Тестируем работу спринга

Вытаскиваем объект music уже из контекста Спринга
Music music = context.getBean("musicBean", Music.class);

Music вначале и в конце позволяет работать со всеми
реализациями этого Интерфейса
Music music = context.getBean("musicBean", Music.class);

В данном уроке мы вручную внедряем зависимость "ИЗ КОНТЕКСТА"
в плеер. В дальнейшем поручим это Спрингу
MusicPlayer musicPlayer = new MusicPlayer(music);

После этого запускаем проигрыватель
musicPlayer.playMusic();
*/
