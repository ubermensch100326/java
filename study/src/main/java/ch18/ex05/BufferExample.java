package main.java.ch18.ex05;

import java.io.*;

public class BufferExample {

    public static void main(String[] args) throws Exception {
        String originalFilePath1 = "C:/Temp/image.jpg";
        String TargetFilePath1 = "C:/Temp/image_copy.jpg";
        FileInputStream fis1 = new FileInputStream(originalFilePath1);
        FileOutputStream fos1 = new FileOutputStream(TargetFilePath1);

        String originalFilePath2 = "C:/Temp/image.jpg";
        String TargetFilePath2 = "C:/Temp/image_copy.jpg";
        FileInputStream fis2 = new FileInputStream(originalFilePath2);
        FileOutputStream fos2 = new FileOutputStream(TargetFilePath2);
        BufferedInputStream bis = new BufferedInputStream(fis2);
        BufferedOutputStream bos = new BufferedOutputStream(fos2);

        long nonBufferTime = copy(fis1, fos1);
        System.out.println("버퍼를 사용하지 않았을 때: " + nonBufferTime + "ms");

        long bufferTime = copy(bis, bos);
        System.out.println("버퍼를 사용했을 때: " + bufferTime + "ms");

        fis1.close();
        fos1.close();
        bis.close();
        bos.close();
    }

    public static long copy(InputStream is, OutputStream os) throws Exception {
        long start = System.currentTimeMillis();
        while (true) {
            int data = is.read();
            if (data == -1) {
                break;
            }
            os.write(data);
        }
        os.flush();
        long end = System.currentTimeMillis();
        return end - start;
    }
}
