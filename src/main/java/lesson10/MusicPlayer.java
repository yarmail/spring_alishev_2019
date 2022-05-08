package lesson10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music music;

    @Autowired
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("playing: " + music.getSong());
    }
}

/*
Первый случай, внедрение через конструктор
с ожиданием конкретного класса
.
    @Autowired
    public MusicPlayer(ClassicalMusic music) {
        this.music = music;
    }
.

---

Второй вариант - мы ожидаем внедрение
с ожиданием любого класса какого-то интерфейса
.
    @Autowired
    public MusicPlayer(Music music) {
        this.music = music;
    }
.
Если у нас таких классов больше,
чем 1 то мы получаем ошибку
... expected single matching bean but found ...:....

---

Также можно проводить внедрение через сеттер
.
    @Autowired
    public void setMusic(Music music) {
        this.music = music;
    }
.
Этот метод может называться как угодно,
@Autowired все равно сможет сделать внедрение

---

Также можно внедрить зависимость через
поле
.
@Component
public class MusicPlayer {
    @Autowired
    private Music music;
.
Интересно, но некоторые говорят лучше через конструктор

---
Спринг успешно внедряет зависимости
от других зависимостей



 */
