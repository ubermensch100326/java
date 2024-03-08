package main.java.ch17.ex06;

public class StreamMatchingExample {

    public static void main(String[] args) {
        int[] intArr = {2, 4, 6};

        boolean result = java.util.stream.IntStream.of(intArr)
                .allMatch(a -> a % 2 == 0);
        System.out.println("모두 2의 배수인가? " + result);

        result = java.util.stream.IntStream.of(intArr)
                .anyMatch(a -> a % 3 == 0);
        System.out.println("하나라도 3의 배수가 있는가? " + result);

        result = java.util.stream.IntStream.of(intArr)
                .noneMatch(a -> a % 3 == 0);
        System.out.println("3의 배수가 없는가? " + result);
    }
}
