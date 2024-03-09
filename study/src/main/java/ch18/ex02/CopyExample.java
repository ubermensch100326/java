package main.java.ch18.ex02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class CopyExample {
    public static void main(String[] args) throws Exception {
        String originalFileName = "C:/Temp/image.jpg";
        String targetFileName = "C:/Temp/iamge_copy.jpg";

//        InputStream is = new FileInputStream(originalFileName);
//        OutputStream os = new FileOutputStream(targetFileName);
//
//        byte[] data = new byte[64];
//
//        Long start = System.currentTimeMillis();
//        while (true) {
//            int num = is.read(data);
//            if (num == -1) break;
//            os.write(data, 0, num);
//        }
//        Long end = System.currentTimeMillis();
//        System.out.println("복사 시간: " + (end - start) + "ms");
//
//        os.flush();
//        os.close();
//        is.close();
//
//        System.out.println("파일 복사 성공");

//        System.out.println(Arrays.toString(data));

        // try with resources
        try (InputStream is2 = new FileInputStream(originalFileName);
             OutputStream os2 = new FileOutputStream(targetFileName)) {
            byte[] data2 = new byte[1024];
            while (true) {
                int num = is2.read(data2);
                if (num == -1) break;
                os2.write(data2, 0, num);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
