package main.java.ch14.ex01;

public class ThreadNameExample {

    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.getName() + " is running");

        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread() {
                @Override
                public void run() {
                    // getName() 메서드는 Thread 클래스의 메서드로 현재 스레드의 이름을 반환함
                    // this를 사용할 수도 있지만, Thread 클래스의 메서드이므로 생략 가능
                    System.out.println(getName() + " is running");
                }
            };
            thread.start();
        }

        Thread chatThread = new Thread() {
            @Override
            public void run() {
                System.out.println(getName() + " is running");
            }
        };

        chatThread.setName("ChatThread");
        chatThread.start();
    }
}
