package main.java.ch09.ex02;

public class Home {
    private RemoteControl rc = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("[익명 구현 객체] TV를 켭니다.");
        }

        @Override
        public void turnOff() {
            System.out.println("[익명 구현 객체] TV를 끕니다.");
        }
    };

    public void use1() {
        rc.turnOn();
        rc.turnOff();
    }

    public void use2() {
        RemoteControl rc = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("[익명 구현 객체] Audio를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("[익명 구현 객체] Audio를 끕니다.");
            }
        };
        rc.turnOn();
        rc.turnOff();
    }

    public void use3(RemoteControl rc) {
        rc.turnOn();
        rc.turnOff();
    }
}
