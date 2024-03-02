package main.java.ch12.ex02;

public class Service {

    /*
     * 이렇게만 해두고 호출한다고 해서 ===...===이 출력되는 것은 아님
     * 각 메서드에 어떤 어노테이션을 붙어있는지 reflection으로 조사하고
     * 해당 어노테이션에 맞게 출력하는 기능까지 작성할 필요가 있음 (Example 클래스 참고)
     */

    @PrintAnnotation
    public void method1() {
        System.out.println("실행 내용1");
    }

    @PrintAnnotation("*")
    public void method2() {
        System.out.println("실행 내용2");
    }

    @PrintAnnotation(value = "#", number = 30)
    public void method3() {
        System.out.println("실행 내용3");
    }
}
