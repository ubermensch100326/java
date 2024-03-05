package main.java.ch16.ex01;

import java.util.PriorityQueue;
import java.util.Queue;

public class LambdaExample {

    public static void action(Calculable calculable) {
        calculable.calculate(100, 200);
    }

    public static void main(String[] args) {
        // 익명 구현 객체 1
        Calculable c1 = new Calculable() {
            @Override
            public void calculate(int x, int y) {
                System.out.println("익명 구현 객체: " + (x + y));
            }
        };
        c1.calculate(10, 20);

        // 람다식 1
        Calculable c2 = (x, y) -> System.out.println("람다식: " + (x + y));
        c2.calculate(10, 20);

        // 익명 구현 객체 2
        // 1에서는 익명 구현 객체를 생성하여 해당 객체의 메서드에 패러미터를 직접 넣어주면서 호출함
        // 2에서는 익명 구현 객체를 매개변수로 전달하여 해당 객체의 데이터를 처리함 (별도로 데이터를 패러미터로 넣어주지 않았음)
        // 1은 사실상 상속 혹은 구현 객체를 만드는 것과 똑같음
        // 반면 2는 데이터 처리 로직을 람다식 (내부적으로는 익명 함수로 처리됨)으로 전달하여 해당 객체의 데이터를 처리함
        // sort할 때 람다식을 전달하면 그에 맞게 정렬해줌
        // 잘 생각해보면 1이나 2나 크게 다르지는 않는 듯
        // 자바는 일단 객체 지향 프로그래밍이기 때문에 그 어떤 것도 객체의 메서드로 처리됨
        // 2는 그냥 1에서 다른 객체로 한번 더 감싸서 연산한다고 생각하면 될 듯함
        LambdaExample.action(new Calculable() {
            @Override
            public void calculate(int x, int y) {
                System.out.println("익명 구현 객체: " + (x + y));
            }
        });

        // 람다식 2
        action((x, y) -> System.out.println("람다식: " + (x + y)));
    }
}
