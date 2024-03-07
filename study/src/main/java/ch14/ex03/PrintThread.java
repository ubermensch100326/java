package main.java.ch14.ex03;

public class PrintThread extends Thread {

    @Override
    public void run() {
        int cnt = 0;
        try {
            while (true) {
                System.out.println("실행 중" + cnt++);
//                Thread.sleep(1);
                if (Thread.interrupted()) {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }
}
