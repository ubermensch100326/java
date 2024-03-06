package main.java.ch17.ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExplanation {

    /*
     * BaseStream을 상속하는 Stream, IntStream, LongStream, DoubleStream이 존재함
     * 1. Stream: 객체 요소를 처리하는 스트림
     * 2. IntStream: int 요소를 처리하는 스트림
     * 3. LongStream: long 요소를 처리하는 스트림
     * 4. DoubleStream: double 요소를 처리하는 스트림
     *
     * 스트림 인터페이스들의 구현 객체는 다양한 리소스로부터 얻을 수 있음
     * 1. 컬렉션: Collection 인터페이스의 하위 인터페이스인 List, Set, Map 컬렉션을 소스로 사용할 수 있음
     * 2. 배열: 배열을 소스로 사용할 수 있음
     * 3. int, long, double 범위: 범위를 소스로 사용할 수 있음
     * 4. 디렉토리
     * 5. 텍스트 파일
     * 6. 랜덤 수
     */

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Stream<Integer> stream = list.stream();

        int[] irr = new int[] {1, 2, 3};
        IntStream stream2 = IntStream.of(irr);
        IntStream stream3 = Arrays.stream(irr);

        stream2.forEach(System.out::println);
        stream3.forEach(System.out::println);

        IntStream intStream = IntStream.rangeClosed(1, 5);
        intStream.forEach(System.out::println);
    }
}
