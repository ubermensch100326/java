package main.java.ch09.ex01;

public class CarExample {

    public static void main(String[] args) {
        Car car = new Car();

        // 필드값으로 익명 자식 객체를 생성하여 대입
        car.run1();

        // 로컬 변수값으로 익명 자식 객체를 생성하여 대입
        car.run2();

        // run3 메서드의 매개값으로 익명 자식 객체를 생성하여 대입
        car.run3(new Tire() {
            @Override
            public void roll() {
                System.out.println("[익명 자식 객체] 타이어4가 굴러갑니다.");
            }
        });
    }
}
