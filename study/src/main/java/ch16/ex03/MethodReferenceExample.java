package main.java.ch16.ex03;

public class MethodReferenceExample {

    public static void main(String[] args) {
        Person person = new Person();

        person.action((x, y) -> x * y);

        person.action((x, y) -> Computer.staticMethod(x, y));

        // 위를 아래와 같이 쓸 수 있음
        // 단, x, y 순서는 동일해야 함
        // 일단은 람다식에서 다른 메서드 호출로 위임할 때 쓰는 듯함
        person.action(Computer::staticMethod);
    }
}
