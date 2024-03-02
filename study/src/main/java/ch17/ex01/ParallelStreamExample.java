package main.java.ch17.ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        list.add("one");
//        list.add("two");
//        list.add("three");
//        list.add("four");
//        list.add("five");
//        list.add("six");
//        list.add("seven");
//        list.add("eight");
//        list.add("nine");
//        list.add("ten");
//        list.add("eleven");
//        list.add("twelve");
//        list.add("thirteen");
//        list.add("fourteen");
//        list.add("fifteen");
//        list.add("sixteen");
//        list.add("seventeen");
//        list.add("eighteen");
//        list.add("nineteen");
//        list.add("twenty");
        for (int i = 0; i < 1_000_000; i++) {
            list.add("item" + i);
        }

        /*
         * 싱글 스트림
         */
        System.out.println("=====================================");
        Long start = System.currentTimeMillis();
        Stream<String> stream = list.stream();
        stream.forEach(s -> System.out.println(Thread.currentThread().getName() + ": " + s));
        Long end = System.currentTimeMillis();
        Long singleStreamTime = end - start;

        /*
         * 병렬 스트림
         * 요소 개수가 적으면 싱글 스트림이 더 빠를 수 있음
         * 요소 작업이 단순하면 싱글 스트림이 더 빠를 수 있음
         * 실제로 이 예시는 싱글 스트림이 더 빠르게 나오는 듯함
         * 참고로 순서대로 처리하고 싶다면 싱글 스트림을 사용해야 함
         */
        System.out.println("=====================================");
        start = System.currentTimeMillis();
        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach(s -> System.out.println(Thread.currentThread().getName() + ": " + s));
        end = System.currentTimeMillis();
        Long parallelStreamTime = end - start;

        System.out.println("=====================================");
        System.out.println("싱글 스트림: " + singleStreamTime);
        System.out.println("병렬 스트림: " + parallelStreamTime);

    }
}
