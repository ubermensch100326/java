package main.java.ch14.ex01;

public class MainThreadExample {

    /*
     * JVM은 기본적으로 main 스레드를 생성하여 main 메서드를 호출함
     * https://stackoverflow.com/questions/18305953/why-does-thread-implement-runnable
     * 주목할 만한 점으로 Thread 클래스가 Runnable 인터페이스를 구현하고 있음
     * 또한 Thread 클래스는 Runnable 객체를 생성자의 인수로 받을 수 있음
     *
     * 멀티 스레드로 처리하려고 할 때
     * 1. Thread 클래스를 상속받아 run 메서드를 오버라이딩하는 방법
     * -> Thread 클래스에 있는 run 메서드를 오버라이딩하여 스레드가 실행할 코드를 작성
     * 2. Runnable 인터페이스를 구현한 객체를 Thread 클래스 생성자의 인수로 전달하는 방법
     * -> Runnable 인터페이스를 구현한 객체는 run 메서드 (Thread 클래스의 run 메서드를 오버라이딩하는 것이 아님)를 오버라이딩하여 스레드가 실행할 코드를 작성
     *
     * 이렇게 2가지가 있는데 다중 상속 불가능 때문에 후자의 방법이 널리 쓰임
     *
     */
    public static void main(String[] args) {
        System.out.println("start");

        Thread currentThread = Thread.currentThread();

        System.out.println("currentThread: " + currentThread);

        System.out.println("currentThread.getName(): " + currentThread.getName());

        System.out.println("currentThread.getPriority(): " + currentThread.getPriority());

        System.out.println("currentThread.getId(): " + currentThread.getId());

        System.out.println("currentThread.getState(): " + currentThread.getState());

        System.out.println("currentThread.isDaemon(): " + currentThread.isDaemon());

        System.out.println("currentThread.isAlive(): " + currentThread.isAlive());

        System.out.println("currentThread.isInterrupted(): " + currentThread.isInterrupted());

        System.out.println("end");

        Thread newThread = new Thread();

        System.out.println("newThread: " + newThread.getName());
    }

}
