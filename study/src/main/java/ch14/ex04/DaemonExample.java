package main.java.ch14.ex04;

public class DaemonExample {

    public static void main(String[] args) {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }

        /*
         * 메인 스레드가 종료되면 데몬 스레드도 함께 종료됨
         * 데몬 스레드는 주 스레드의 작업을 돕는 보조적인 역할을 수행하므로 주 스레드가 종료되면 데몬 스레드도 종료되는 게 올바름
         */
        System.out.println("메인 스레드 종료");
    }
}
