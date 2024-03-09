package main.java.ch18.ex01;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

    public static void main(String[] args) {
        OutputStream os = null;
        try {
            os = new FileOutputStream("C:/Temp/test1.db");

            // write()를 호출하면 1바이트만 출력됨
            // 10진수로 10은 00001010, 20은 00010100, 30은 00011110
            // 4바이트 중 가장 오른쪽 1바이트만 출력됨
            byte a = 10;
            byte b = 20;
            byte c = 30;

            os.write(a);
            os.write(b);
            os.write(c);

            // write()를 한다고 해서 바로 출력되는 것이 아니라 버퍼에 저장되어 있음
            // flush()를 호출해야 버퍼에 있는 내용이 출력됨
            // 참고로 close()를 호출하면 자동으로 flush()가 호출됨
            os.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // OutputStream은 AutoCloseable 인터페이스를 구현하고 있으므로 try-with-resources문을 사용할 수 있음
        // try-with-resources문을 사용하면 close()를 호출하지 않아도 자동으로 close()가 호출됨
        // close()를 호출하면 자동으로 close() 이전에 flush()가 호출됨
        // 두 번째 매개값을 true로 주면 파일의 끝에 추가됨 (기존 파일에 추가됨)
        // 두 번째 매개값을 안 주면 기존 파일에 덮어씀
        try (OutputStream os2 = new FileOutputStream("C:/Temp/test2.db", true)) {
            byte a = 10;
            byte b = 20;
            byte c = 30;

            os2.write(a);
            os2.write(b);
            os2.write(c);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // write()에 배열을 매개값으로 넣어주는 경우 배열의 모든 내용을 출력함
        try (OutputStream os3 = new FileOutputStream("C:/Temp/test3.db")) {
            byte[] array = {10, 20, 30, 40, 50};
            os3.write(array);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // write()에 배열, 시작 인덱스, 개수를 매개값으로 넣어주는 경우 시작 인덱스부터 (포함) 개수만큼 출력함
        try (OutputStream os4 = new FileOutputStream("C:/Temp/test4.db")) {
            byte[] array = {10, 20, 30, 40, 50};
            os4.write(array, 1, 3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
