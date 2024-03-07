package main.java.ch14.ex03;

public class InterruptedExample {

    public static void main(String[] args) {
        Thread thread = new PrintThread();
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /*
         * interrupt()는 실행을 중지시키는 것이 아님
         * intterupt()는 해당 스레드가 일시정지 상태가 되면 InterruptedException을 발생시킴
         * 그래서 PrintThread의 run() 메서드에서 Thread.sleep()을 수행하도록 하였음
         * 스레드가 실행/대기 상태일 때에는 interrupt() 메서드가 호출되더라도 InterruptedException이 발생하지 않음
         *
         * 그런데 강제로 PrintThread에서 Thread.sleep()을 하도록 한다는 것이 마음에 안 들 수 있음
         * 그럴 때 사용하는 것이 Thread의 isInterrupted() 메서드임
         * Thread.isInterrupted()는 isInterrupted() 메서드가 호출되기 이전에 interrupt() 메서드가 호출되었는지 확인하여 boolean 값을 반환함
         *
         * */
        thread.interrupt();
    }
}
