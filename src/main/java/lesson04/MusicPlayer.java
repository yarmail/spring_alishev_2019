package lesson04;

public class MusicPlayer {
    private Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("playing: " + music.getSong());
    }
}
/*
в этом классе применяем IoC
(внешнее управление через конструктор)
 */