package main.java.ch09.ex03;

public class ButtonExample {

    public static void main(String[] args) {

        // 익명 객체 사용하지 않은 경우
        Button btnOk = new Button();
        Button btnCancel = new Button();

        class OkListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("OK 버튼을 클릭했습니다.");
            }
        }

        class CancelListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼을 클릭했습니다.");
            }
        }

        btnOk.setClickListener(new OkListener());
        btnCancel.setClickListener(new CancelListener());

        btnOk.click();
        btnCancel.click();

        System.out.println("=========================================");

        // 익명 객체 사용한 경우
        Button btnOk2 = new Button();
        Button btnCancel2 = new Button();

        btnOk2.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("OK 버튼을 클릭했습니다.");
            }
        });

        btnCancel2.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼을 클릭했습니다.");
            }
        });

        btnOk2.click();
        btnCancel2.click();
    }
}
