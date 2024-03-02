package main.java.ch09.ex03;

public class Button {

    private ClickListener listener;

    public void setClickListener(ClickListener listener) {
        this.listener = listener;
    }

    public void click() {
        listener.onClick();
    }

    // 중첩 인터페이스
    public static interface ClickListener {
        void onClick();
    }
}
