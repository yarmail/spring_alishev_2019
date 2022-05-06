package lesson08;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("lesson08.xml");
        ClassicalMusic classicalMusic =
                context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());
        context.close();
    }
}
/*
Проверяем работу init и destroy методов
при вызове метода classicalMusic.getSong()
сначала вызовется init, потом этот метод,
потом дестрой
*/
