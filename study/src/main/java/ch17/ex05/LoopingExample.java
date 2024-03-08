package main.java.ch17.ex05;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class LoopingExample {

    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};

        /*
         * peek()은 중간 처리 메서드임
         * 따라서 아래와 같이 하면 최종 처리가 없어서 제대로 동작하지 않음
         */
        Arrays.stream(intArr)
                .filter(a -> a%2 == 0)
                .peek(System.out::println);

        int sum = Arrays.stream(intArr)
                .filter(a -> a%2 == 0)
                .peek(System.out::println)
                .sum();
        System.out.println("sum: " + sum);

        /*
         * forEach()는 최종 처리 메서드임
         * 따라서 아래는 제대로 동작함
         */
        Arrays.stream(intArr)
                .filter(a -> a%2 == 0)
                .forEach(System.out::println);

        System.out.println("=====================================");
        Arrays.stream(intArr)
                .filter(a -> a%2 == 0)
                .forEach(new IntConsumer() { // 여기서 매개변수 타입이 Integer가 아니라 int이기 때문에 Consumer 대신 IntConsumer를 사용해야 함
                    @Override
                    public void accept(int value) {
                        System.out.println(value);
                    }
                });
    }
}
