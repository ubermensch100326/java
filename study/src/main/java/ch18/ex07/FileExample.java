package main.java.ch18.ex07;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class FileExample {

    public static void main(String[] args) {
        File dir = new File("C:/Temp/images");
        File file1 = new File("C:/Temp/file1.txt");
        File file2 = new File("C:/Temp/file2.txt");
        File file3 = new File("C:/Temp/file3.txt");

        if (dir.exists() == false) {
            dir.mkdirs();
        }
        if (file1.exists() == false) {
            try {
                file1.createNewFile();
            } catch (Exception e) {}
        }
        if (file2.exists() == false) {
            try {
                file2.createNewFile();
            } catch (Exception e) {}
        }
        if (file3.exists() == false) {
            try {
                file3.createNewFile();
            } catch (Exception e) {}
        }

        File temp = new File("C:/Temp");
        File[] contents = temp.listFiles();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
        Arrays.stream(contents).forEach(f -> {
            System.out.print(sdf.format(f.lastModified()));
            if (f.isDirectory()) {
                System.out.print("\t<DIR>\t\t" + f.getName());
            } else {
                System.out.print("\t\t\t" + f.length() + "\t" + f.getName());
            }
            System.out.println();
        });
    }
}
