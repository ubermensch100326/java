package main.java.ch16.ex02;

public class Person {
    public void action(Workable workable) {
        workable.work("홍길동", "프로그래밍");
    }

    public void action(Speakable speakable) {
        speakable.speak("Hello, World!");
    }
}
