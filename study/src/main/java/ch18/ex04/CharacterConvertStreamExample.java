package main.java.ch18.ex04;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class CharacterConvertStreamExample {

    public static void main(String[] args) {
        OutputStream os = null;
        Writer writer = null;
        try {
            os = new FileOutputStream("C:/Temp/test.txt");
            writer = new OutputStreamWriter(os, "UTF-8");
            String str = "문자 변환 스트림을 사용합니다.";
//            byte[] buffer = str.getBytes("UTF-8");
//            os.write(buffer);
//            os.flush();
            writer.write(str);
            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//            try {
//                os.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
            try {
                writer.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
