package lesson02;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("lesson02.xml");
        TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getMessage());
        context.close();
    }
}
/*
В этом классе мы будем тестировать
работу нашего Spring framework

Мы создаем контекст спринга и помещаем
туда конфигурационный файл xml. с описанием бинов
ClassPathXmlApplicationContext context ...

ClassPath ищет её в папке resources

Как я понимаю, после этого мы получаем бин уже из контекста
TestBean testBean = context.getBean....
и проверяем его работоспособность, получая его поле
System.out.println(testBean.getMessage());
 */
