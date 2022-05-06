package lesson08;

import lesson06.Music;

public class ClassicalMusic implements Music {

    private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("делаю Init метод");
    }

    @Override
    public String getSong() {
        return "Классическая музыка";
    }

    public void doMyDestroy() {
        System.out.println("делаю Destroy метод");
    }
}

/*
Добавляем init и destroy методы

---

подготавливаем класс к factory-method
создаем приватный конструктор, чтобы нельзя было
сделать объект через new
    private ClassicalMusic() {}

Далее создаем статический метод,
который будет возвращать объект
    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

 */