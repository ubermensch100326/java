package main.java.ch13.ex01;

import java.util.ArrayDeque;

public class GenericExample {

    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.content = "홍길동";
        String str = box1.content;
        System.out.println(str);

        Box<Integer> box2 = new Box<>();
        box2.content = 1;
        int value = box2.content;
        System.out.println(value);

        // 이렇게 쓰면 기본적으로 Object 타입임
        // Box<Object> box3 = new Box<>();라고 보면 됨
        Box box3 = new Box();
        box3.content = new ArrayDeque<Integer>();
        ((ArrayDeque<Integer>) box3.content).add(7);
        ((ArrayDeque<Integer>) box3.content).add(77);
        ArrayDeque<Integer> deque = (ArrayDeque<Integer>) box3.content;
        deque.stream().forEach(System.out::println);
    }
}
