package main.java.ch16.ex04;

public class Person {

    /*
     * 매개변수로 Comparable 구현 객체가 오면 됨
     * 근데 Comparable은 FunctionalInterface이므로 람다식을 넣어도 됨
     */
    public void ordering(Comparable comparable) {
        String a = "홍길동";
        String b = "김길동";

        int result = comparable.compare(a, b);

        if (result < 0) {
            System.out.println(a + "이 " + b + "보다 먼저 옵니다.");
        } else if (result == 0) {
            System.out.println(a + "과 " + b + "은 같습니다.");
        } else {
            System.out.println(a + "이 " + b + "보다 나중에 옵니다.");
        }
    }
}
