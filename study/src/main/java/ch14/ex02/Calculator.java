package main.java.ch14.ex02;

public class Calculator {
    private int memory;

    /*
     * synchronized 키워드를 사용하여 메서드 전체를 임계 영역으로 지정
     * 임계 영역: 하나의 스레드만 실행할 수 있는 영역
     */
    public synchronized void setMemory(int memory) {
        this.memory = memory;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(Thread.currentThread().getName() + ": " + this.memory);
        }
    }

    public void setMemoryPart(int memory) {
        // ...
        synchronized (this) {
            this.memory = memory;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(Thread.currentThread().getName() + ": " + this.memory);
            }
        }
        // ...
    }

    public int getMemory() {
        return memory;
    }
}
