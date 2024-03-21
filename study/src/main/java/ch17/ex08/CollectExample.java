package main.java.ch17.ex08;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {

    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("홍길동", "남자", 10));
        totalList.add(new Student("김수애", "여자", 6));
        totalList.add(new Student("신용권", "남자", 12));
        totalList.add(new Student("박수미", "여자", 7));
        totalList.add(new Student("박수환", "여자", 8));

        // 남학생만 묶어 List 생성
//        List<Student> maleList = totalList.stream()
//                .filter(s -> s.getSex().equals("남자"))
//                .collect(Collectors.toList());
//        maleList.forEach(System.out::println);

        // toList() 사용
        List<Student> maleList = totalList.stream()
                .filter(s -> s.getSex().equals("남자"))
                .toList();
        maleList.forEach(System.out::println);

        // 학생 이름을 키, 성별을 값으로 Map 생성
        Map<String, String> map = totalList.stream()
                .collect(Collectors.toMap(Student::getName, Student::getSex));
        map.forEach((K, V) -> System.out.println(K + "-" + V));

        // 요소 그룹핑
        // 단순히 요소를 수집하는 기능 외에도 요소를 그룹핑하여 수집하는 기능을 제공
        // Collectors.groupingBy() 메서드를 사용하여 얻은 Collector를 collect() 메서드를 호출할 때 제공하면 됨
        Map<String, List<Student>> map2 = totalList.stream()
                .collect(Collectors.groupingBy(Student::getSex));
        System.out.println("==남자==");
        map2.get("남자").forEach(s -> System.out.println(s.getName()));
        System.out.println("==여자==");
        map2.get("여자").forEach(s -> System.out.println(s.getName()));

        // 그룹핑 후 집계
        Map<String, Double> map3 = totalList.stream()
                .collect(Collectors.groupingBy(Student::getSex, Collectors.averagingDouble(Student::getAge)));
        System.out.println("남자 평균 나이: " + map3.get("남자"));
        System.out.println("여자 평균 나이: " + map3.get("여자"));
    }
}
