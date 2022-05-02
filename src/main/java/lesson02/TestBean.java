package lesson02;

public class TestBean {
    private String message;

    public TestBean(String name) {
        this.message = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
/*
Как я понимаю, bean это обычный объект в спринге,
то есть из этого обычного класса мы создадим
объект спринга - бин.
*/
