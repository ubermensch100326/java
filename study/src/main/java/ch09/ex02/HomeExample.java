package main.java.ch09.ex02;

public class HomeExample {

    public static void main(String[] args) {
        Home home = new Home();

        // 필드값으로 익명 구현 객체를 생성하여 대입
        home.use1();

        // 로컬 변수값으로 익명 구현 객체를 생성하여 대입
        home.use2();

        // run3 메서드의 매개값으로 익명 구현 객체를 생성하여 대입
        home.use3(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("[익명 구현 객체] Heater를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("[익명 구현 객체] Heater를 끕니다.");
            }
        });
    }
}
