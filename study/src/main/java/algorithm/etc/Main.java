package main.java.algorithm.etc;

public class Main {

    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(myThread);
            thread.start();
        }

    }

    static class MyInnerClass {
        int counter = 0;
        public void print(String threadName) {
            System.out.println(threadName + " : " + counter++);
        }
    }
}

class MyThread implements Runnable {
    @Override
    public void run() {
        Main.MyInnerClass myInnerClass = new Main.MyInnerClass();
        myInnerClass.print(Thread.currentThread().getName());
    }
}
