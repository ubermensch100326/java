package main.java.ch12.ex01;

public class Reflection {

    /*
     * 리플렉션 (Reflection)
     * 자바는 클래스와 인터페이스의 메타 정보를 Class 객체로 관리함
     * 여기서 메타 정보란 패키지 정보, 타입 정보, 멤버 (생성자, 필드, 메서드) 정보 등을 말함
     * 이러한 메타 정보를 프로그램에서 읽고 수정하는 행위를 리플렉션이라고 함
     *
     * 프로그램에서 Class 객체를 얻으려면 다음과 같이 3가지 방법이 있음
     * 1. 클래스명.class 키워드 (클래스로부터 얻는 방법)
     * 2. Class.forName("패키지...클래스명") 메서드 (클래스로부터 얻는 방법)
     * 3. 객체참조변수.getClass() 메서드 (객체로부터 얻는 방법)
     */

    public static void main(String[] args) throws Exception {
        // 1. 클래스명.class 키워드 (클래스로부터 얻는 방법)
        Class clazz1 = String.class;
        System.out.println(clazz1.getName());

        // 2. Class.forName("패키지...클래스명") 메서드 (클래스로부터 얻는 방법)
        Class clazz2 = Class.forName("java.lang.String");
        System.out.println(clazz2.getName());

        // 3. 객체참조변수.getClass() 메서드 (객체로부터 얻는 방법)
        String str = new String("abc");
        Class clazz3 = str.getClass();
        System.out.println(clazz3.getName());
        System.out.println(clazz3.getDeclaredConstructor());
        // getResource() 메서드는 클래스 경로로부터 상대 경로에 있는 리소스를 찾아서
        // URL 객체로 반환함
        // 일단 아래 예제는 null 나옴
        System.out.println(clazz3.getResource(clazz3.getName()));
    }
}
