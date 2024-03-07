package main.java.ch17.ex04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamFlatMapExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("this is java 21");
        list.add("i am a java developer");
        list.stream()
                .flatMap(data -> Arrays.stream(data.split(" ")))
                .forEach(System.out::println);

//        list.stream()
//                .flatMap(data -> Arrays.asList(data.split(" ")).stream())
//                .forEach(System.out::println);

        List<String> list2 = Arrays.asList("1, 2, 3", "10, 20, 30, 40, 50");
        list2.stream()
                .flatMapToInt(data -> {
                    String[] strArr = data.split(",");
                    int[] intArr = new int[strArr.length];
                    for (int i = 0; i < strArr.length; i++) {
                        intArr[i] = Integer.parseInt(strArr[i].trim());
                    }
                    return Arrays.stream(intArr);
                })
                .forEach(System.out::println);
    }
}
