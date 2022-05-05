package lesson06;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("lesson06.xml");
        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        context.close();
    }
}
/*
Теперь мы можем закоментировать старый вариант
и получить новый бин уже с внедренным
стилем музыки (один бин через другой)
MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

Теперь мы можем достать из контекста
наши значения полей, которые мы ранее положили в property
в конфиг файле.
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

*/
