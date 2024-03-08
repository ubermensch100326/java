package main.java.ch17.ex07;

import java.util.Arrays;

public class AggregateExample {

    /*
     * 스트림이 제공하는 기본 집계 메서드 중
     * Optional 객체를 제공하는 메서드
     * findFirst(), max(), min(), average()
     *
     * Optional 관련 클래스는 단순히 집계값만 저장하는 것이 아니라
     * 집계값이 없을 때 대신 사용할 기본값을 지정하거나 집계값을 처리하는 Consumer를 지정할 수 있음
     *
     * Optional 관련 클래스가 제공하는 메서드
     * orElse() -> 집계값이 없을 때 기본값을 리턴
     * isPresent() -> 집계값이 있으면 true, 없으면 false
     * ifPresent() -> Consumer를 매개값으로 받아 집계값이 있을 때만 실행
     */

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5, 6};
        
        // 카운팅
        long count = Arrays.stream(arr)
                .filter(a -> a % 2 == 0)
                .count();
        System.out.println("2의 배수 개수: " + count);
        
        // 총합
        int sum = Arrays.stream(arr)
                .filter(a -> a % 2 == 0)
                .sum();
        System.out.println("2의 배수의 합: " + sum);
        
        // 평균
        // average() 메소드는 OptionalDouble 객체를 리턴하므로 getAsDouble() 메소드를 호출해야 함
        // 원래는 isPresent() 메소드를 호출해 집계값이 있는지 확인해야 함
        // getAsDouble() 메서드를 호출했을 때 집계값이 존재하지 않으면 NoSuchElementException 발생하기 때문임
        double avg = Arrays.stream(arr)
                .filter(a -> a % 2 == 0)
                .average()
                .getAsDouble();
        System.out.println("2의 배수의 평균: " + avg);
        
        // 최대값
        int max = Arrays.stream(arr)
                .filter(a -> a % 2 == 0)
                .max()
                .getAsInt();
        System.out.println("최대값: " + max);

        // 최소값
        int min = Arrays.stream(arr)
                .filter(a -> a % 2 == 0)
                .min()
                .getAsInt();
        System.out.println("최소값: " + min);

        // reduce() 메소드를 이용한 합계
        int sum2 = Arrays.stream(arr)
                .filter(a -> a % 2 == 0)
                .reduce(0, (a, b) -> a + b);
        System.out.println("2의 배수의 합 (reduce): " + sum2);

        // reduce() 메소드를 이용한 최대값
        int max2 = Arrays.stream(arr)
                .filter(a -> a % 2 == 0)
                .reduce(0, (a, b) -> a > b ? a : b);
        System.out.println("최대값 (reduce): " + max2);

        // reduce() 메소드를 이용한 최소값
        int min2 = Arrays.stream(arr)
                .filter(a -> a % 2 == 0)
                .reduce(0, (a, b) -> a < b ? a : b);
        System.out.println("최소값 (reduce): " + min2);

        // 첫 번째 요소
        int first = Arrays.stream(arr)
                .filter(a -> a % 2 == 0)
                .findFirst()
                .getAsInt();
        System.out.println("첫 번째 요소: " + first);
    }
}

