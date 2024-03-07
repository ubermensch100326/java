package main.java.ch14.ex05;

public class ThreadPool {

    /*
     * 매우 중요한 개념
     * 스레드를 미리 만들어두고 이를 풀에 저장해두었다가 필요할 때 꺼내서 사용하는 방식
     * 스레드를 생성하고 삭제하는 작업은 비용이 많이 드는 작업인데, 스레드 풀을 사용하면 이러한 비용을 줄일 수 있음
     *
     * Java는 스레드풀을 생성하고 사용할 수 있도록 java.util.concurrent 패키지에서
     * ExecutorService 인터페이스와 Executors 클래스를 제공함
     * Executors의 newCachedThreadPool() 메서드와 newFixedThreadPool() 메서드를 사용하면
     * 간단하게 스레드풀을 생성할 수 있음
     *
     * newCachedThreadPool() 메서드는 필요에 따라 스레드를 생성하고, 스레드가 60초 동안 사용되지 않으면 스레드를 삭제함
     * newFixedThreadPool() 메서드는 스레드가 최대 개수를 유지함
     *
     * 스레드풀 종료
     * 스레드풀을 종료하려면 ExecutorService 인터페이스의 shutdown() 메서드를 호출하면 됨
     * 그런데 현재 실행 중인 작업이 있다면 그게 모두 끝나고 나서야 종료됨
     * shutdownNow() 메서드를 호출하면 현재 실행 중인 작업을 취소하고 종료됨
     *
     * 스레드가 작업을 처리하고 나서 결과를 반환할 필요가 없으면 Runnable 구현 클래스를 사용함
     * 스레드가 작업을 처리하고 나서 결과를 반환해야 한다면 Callable 구현 클래스를 사용함
     *
     * 작업 처리 요청이란 ExecutorService의 작업 큐에 Runnable 혹은 Callable 객체를 넣는 행위를 말함 (바로 처리되는 것이 아님에 주의할 것)
     * ExecutorService는 execute(Runnable command) 메서드와 submit(Callable<T> task) 메서드를 제공함
     * execute() 메서드는 작업 처리 결과를 반환하지 않음
     * submit() 메서드는 작업 처리 결과를 Future<T> 객체로 반환함
     */
}
