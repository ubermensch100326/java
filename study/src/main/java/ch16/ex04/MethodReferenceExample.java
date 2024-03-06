package main.java.ch16.ex04;

import main.java.ch16.ex03.Computer;

public class MethodReferenceExample {

    public static void main(String[] args) {

        Person person = new Person();

        /*
         * 클래스 :: 인스턴스 메서드
         * 와 같은 경우에는 아래와 같이 해석해야 함
         */

        person.ordering((o1, o2) -> o1.compareToIgnoreCase(o2));

        /*
         * a는 String 타입임
         * 인스턴스 a의 compareToIgnoreCase 인스턴스 메서드를 호출해서 b와 비교함
         */

        person.ordering(String::compareToIgnoreCase);

        /*
         * 클래스 :: 정적 메서드
         * 와 같은 경우에는 패러미터가 정적 메서드의 패러미터에 다 들어가는 것임
         * 차이점 잘 숙지할 것
         * person.ordering((o1, o2) -> Computer.staticMethod(o1, o2));
         */
    }
}
