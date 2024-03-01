package main.java.ch14;

import java.awt.*;

public class MultiThreadByExtendsExample {

    public static void main(String[] args) {

        // Thread 클래스를 상속받아 run 메서드를 오버라이딩하는 방법
        Thread thread = new Thread() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();

                for (int i = 0; i < 5; i++) {
                    toolkit.beep();
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        thread.start();

//        for (int i = 0; i < 5; i++) {
//            System.out.println("띵");
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }

//        Thread thread2 = new Thread(new Task());
//        thread2.start();

        Thread thread3 = new PrintThread();
        thread3.start();
    }
}
