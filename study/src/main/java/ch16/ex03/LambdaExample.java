package main.java.ch16.ex03;

public class LambdaExample {

    public static void main(String[] args) {
        Person person = new Person();

        person.action(new Workable() {
            @Override
            public void work(String name, String job) {
                System.out.println(name + "은 " + job + "을 합니다.");
            }
        });

        person.action((name, job) -> System.out.println(name + "은 " + job + "을 합니다."));

        person.action(new Speakable() {
            @Override
            public void speak(String message) {
                System.out.println(message + "라고 입력합니다.");
            }
        });

        person.action(message -> System.out.println(message + "라고 입력합니다."));
    }
}
