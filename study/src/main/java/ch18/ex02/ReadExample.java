package main.java.ch18.ex02;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class ReadExample {

    public static void main(String[] args) {
        try (InputStream is = new FileInputStream("C:/Temp/test1.db")) {
            int readByte = is.read();
            System.out.println(readByte);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (InputStream is = new FileInputStream("C:/Temp/test1.db")) {
            while (true) {
                int readByte = is.read();
                if (readByte == -1) break;
                System.out.println(readByte);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("====================================");
        System.out.println("start");

        try (InputStream is = new FileInputStream("C:/Temp/test3.db")) {
            byte[] readBytes = new byte[2];
            while (true) {
                int readByteNo = is.read(readBytes);
                if (readByteNo == -1) break;
                for (int i = 0; i < readByteNo; i++) {
                    System.out.println(readBytes[i]);
                }
                System.out.println("====================================");
            }
            System.out.println("end");
            System.out.println(Arrays.toString(readBytes));

            /*
             *
             * start
                10
                20
                ====================================
                30
                40
                ====================================
                50
                ====================================
                end
                [50, 40]
             */

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
