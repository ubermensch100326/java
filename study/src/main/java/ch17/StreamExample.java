package main.java.ch17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StreamExample {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("one");
        set.add("two");
        set.add("three");

        System.out.println("=====================================");
        System.out.println("Using for each loop");
        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("=====================================");
        System.out.println("Using Iterator");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /*
         * Interface Stream<T>
         * forEach(Consumer<? super T> action)
         * <? super T> 의미: T 또는 T의 상위 클래스
         * Consumer 인터페이스의 메서드 accept(T t)를 구현한 객체를 전달
         *
         * Interface Consumer<T>
         * Functional Interface이기 때문에
         * Consumer 인터페이스를 구현한 클래스를 람다식으로 표현 가능
         * Consumer가 가지고 있는 메서드: void accept(T t), void andThen(Consumer<? super T> after)
         * accept(T t): T 타입의 인수를 받아서 어떤 작업을 수행
         * andThen(Consumer<? super T> after): 두 개의 Consumer를 순차적으로 연결
         *
         * 참고로 stream은 한 번 사용하면 닫혀서 재사용이 불가능
         * 
         * stream의 장점
         * 1. 내부 반복자이므로 처리 속도가 빠르고 병렬 처리에 효율적임
         * 2. 람다식으로 다양한 요소 처리를 정의할 수 있음
         * 3. 중간 처리와 최종 처리를 수행하도록 하여 파이프 라인을 형성할 수 있음 (stream은 하나 이상 연결될 수 있음)
         *
         */

        System.out.println("=====================================");
        System.out.println("Using Stream");
//        Stream<String> stream = set.stream();
//        stream.forEach(s -> System.out.println(s));
        set.stream().forEach(s -> System.out.println(s));
    }
}
