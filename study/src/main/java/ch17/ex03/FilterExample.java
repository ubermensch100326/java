package main.java.ch17.ex03;

import java.util.ArrayList;
import java.util.List;

public class FilterExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("강감찬");
        list.add("이순신");
        list.add("김유신");
        list.add("홍길동");
        list.add("홍싸피");
        list.add("이순신");
        list.add("이순신");

        list.stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println("=====================================");

        list.stream()
                .filter(s -> s.startsWith("홍"))
                .forEach(System.out::println);

        System.out.println("=====================================");

        list.stream()
                .filter(s -> s.startsWith("홍"))
                .distinct()
                .forEach(System.out::println);
    }
}
