package lesson06;

public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("playing: " + music.getSong());
    }
}
/*
До этого внедряли зависимость с помощью конструктора

    public MusicPlayer(Music music) {
        this.music = music

теперь попробуем внедрить нашу зависимость из сеттера

---

для показа внедрения простых полей в качестве зависимости
создадим два поля
    private String name;
    private int volume;
(наименование произведения и громкость)
для этих полей создадим геттеры и сеттеры
*/