package main.java.ch09.ex01;

public class Car {
    // 참고로 tire1과 tire2는 static이 아님
    // Car의 인스턴스가 생성될 때마다 각 인스턴스마다 새로운 tire1과 tire2도 생성됨
    // 인스턴스 변수임
    // 만약 static으로 선언하면 모든 Car 인스턴스가 같은 tire1과 tire2를 공유하게 됨
    private Tire tire1 = new Tire();
    private Tire tire2 = new Tire() {
        @Override
        public void roll() {
            System.out.println("[익명 자식 객체] 타이어2가 굴러갑니다.");
        }
    };

    public void run1() {
        tire1.roll();
        tire2.roll();
    }

    public void run2() {
        Tire tire = new Tire() {
            @Override
            public void roll() {
                System.out.println("[익명 자식 객체] 타이어3가 굴러갑니다.");
            }
        };
        tire.roll();
    }

    public void run3(Tire tire) {
        tire.roll();
    }

}
