package lesson10;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("lesson10.xml");
        MusicPlayer musicPlayer =
                context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        context.close();
    }
}

/*
После того, как мы явно указали в musicPlayer, что ожидаем
бин именно ClassicalMusic
.
    @Autowired
    public MusicPlayer(ClassicalMusic music) {
        this.music = music;
    }
.
@Autowired автоматически нашла для нас соответствующий
бин и при проигрывании музыки мы получили
playing: Классическая музыка
 */
