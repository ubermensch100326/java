package main.java.algorithm.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class SortExample {

    public static void main(String[] args) {

        /*
         * 제네릭 메서드, 와일드카드 타입 파라미터, 스트림, 함수 인터페이스, 정적 메서드 등 배운 것들을 최대한 활용해서 짜봤음
         * 근데 아직은 많이 생소해서 꾸준히 써볼 필요가 있음
         */

        List<Integer> list = new Random().ints(10, 1, 10).collect(ArrayList::new, List::add, List::addAll);
        new SelectionSort<Integer>().sort(list);
    }
}
