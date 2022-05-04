package lesson05;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("lesson05.xml");
        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        context.close();
    }
}
/*
Теперь мы можем закоментировать старый вариант
и получить новый бин уже с внедренным
стилем музыки (один бин через другой)
MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
*/
