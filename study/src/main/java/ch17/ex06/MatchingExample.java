package main.java.ch17.ex06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MatchingExample {

    /*
     * 스트림에서 매칭은 요소들이 특정 조건에 만족하는지 여부를 조사하는 최종 처리 기능임
     *
     * allMatch(Predicate<T> predicate) : 모든 요소가 predicate의 조건에 만족하는지 조사
     * allMatch(IntPredicate predicate) : 모든 요소가 predicate의 조건에 만족하는지 조사
     * allMatch(LongPredicate predicate) : 모든 요소가 predicate의 조건에 만족하는지 조사
     * allMatch(DoublePredicate predicate) : 모든 요소가 predicate의 조건에 만족하는지 조사
     */

    public static void main(String[] args) {
//        Map<Integer, Integer> map = new HashMap<>();
//        map.put(1, 1);
//        map.put(2, 2);
//        map.put(3, 3);
//        boolean flag = map.entrySet().stream().allMatch(e -> e.getKey() == e.getValue());
//        System.out.println("모든 키와 값이 같은가? " + flag);
//
//        List<Integer> list = List.of(1, 2, 3, 4, 5);
//        list.forEach(System.out::println);
//        list.stream().forEach(System.out::println);

//        System.out.println("Collections.forEach() Start");
//
//        list.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer t) {
//                if (t > 3) {
//                    list.add(3);
//                }
//                System.out.println(t);
//            }
//        });
//
//        System.out.println("Collections.forEach() End");

//        System.out.println("Stream.forEach() Start");
//
//        list.stream().forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer t) {
//                if (t > 3) {
//                    list.add(3);
//                }
//                System.out.println(t);
//            }
//        });
//
//        System.out.println("Stream.forEach() End");

        concurrentTest();
        concurrentTest2();
    }

    static void concurrentTest() {
        List<Integer> intList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));
//        List<Integer> intList = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        Consumer<Integer> consumer =
                (num) -> {
                    if (num > 3) {
                        intList.add(num);
                    }
                    System.out.println(num);
                };
        try {
            intList.forEach(consumer);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(intList);
        }
    }

    static void concurrentTest2() {
        List<Integer> intList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));
//        List<Integer> intList = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        Consumer<Integer> consumer =
                (num) -> {
                    if (num > 3) {
                        intList.add(num);
                    }
                    System.out.println(num);
                };
        try {
            intList.stream().forEach(consumer);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(intList);
        }
        // 왜 List.of로 할 때는 둘 다 3까지만 출력되고 종료되지?
    }
}
