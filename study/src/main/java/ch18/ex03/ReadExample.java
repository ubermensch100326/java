package main.java.ch18.ex03;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {
    public static void main(String[] args) {
        try {
            Reader reader = new FileReader("C:/Temp/test.txt");
            while (true) {
                int data = reader.read();
                if (data == -1) break;
                System.out.print((char) data);
            }
            reader.close();
            System.out.println("=====================================");

            reader = new FileReader("C:/Temp/test.txt");
            char[] buffer = new char[5];
            while (true) {
                int readCharNum = reader.read(buffer);
                if (readCharNum == -1) break;
                for (int i = 0; i < readCharNum; i++) {
                    System.out.print(buffer[i]);
                }
                System.out.println();
            }
            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
