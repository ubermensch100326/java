package main.java.ch17.ex02;

import java.util.List;

public class StreamPipeLineExample {

    public static void main(String[] args) {
        // of를 이용하면 불변 리스트를 생성할 수 있음
        // asList도 비슷한데 조금 다름
        List<Student> list = List.of(
                new Student("홍길동", 90),
                new Student("신용권", 92)
        );

        double avg = list.stream()
                .mapToInt(student -> student.getScore())
                .average()
                .getAsDouble();

        System.out.println("평균 점수: " + avg);

        double avg2 = list.stream()
                .mapToInt(Student::getScore)
                .average()
                .getAsDouble();

        System.out.println("평균 점수: " + avg2);

        list.stream()
                .map(Student::getName)
                .forEach(name -> System.out.println(name));
    }
}
