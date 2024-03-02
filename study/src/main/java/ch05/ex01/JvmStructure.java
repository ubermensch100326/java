package main.java.ch05.ex01;

public class JvmStructure {

    /*
     * java 명령어로 JVM이 구동되면 JVM은
     * 운영체제에서 할당받은 메모리 영역(Runtime Data Area)을
     * 세부적으로 여러 영역으로 나누어 관리함
     *
     * 1. Method Area
     * 메서드 영역은 바이트 코드 파일을 읽은 내용이 저장되는 영역
     * 클래스별로 상수, 정적 필드, 메서드 코드, 생성자 코드 등이 저장됨
     *
     * 2. Heap
     * 힙 영역은 객체가 저장되는 영역
     * 객체의 주소는 메서드 영역과 스택 영역의 상수와 변수에서 참조할 수 있음
     *
     * 3. Stack
     * 메서드를 호출할 때마다 생성되는 프레임이 저장되는 영역
     * 메서드 호출이 끝나면 프레임은 자동 제거됨
     * 프레임 내부에는 로컬 변수 스택이 있는데, 여기에서 기본 타입 변수와 참조 타입 변수가 생성되고 제거됨
     */
}