package main.java.ch18.ex03;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {
    public static void main(String[] args) {
        Writer writer = null;
        try {
             writer = new FileWriter("C:/Temp/test.txt");

            char a = 'A';
            writer.write(a);

            char b = 'B';
            writer.write(b);

            char[] arr = {'C', 'D', 'E'};
            writer.write(arr);

            writer.write("FGH");
            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
