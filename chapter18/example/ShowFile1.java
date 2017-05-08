package chapter18.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ShowFile1 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("使用法：java ShowFile1 ファイル");
            System.out.println("例：java chapter18/example/ShowFile1 ../src/chapter18/example/ShowFile1.java");
            System.exit(0);
        }
        String filename = args[0];
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println(filename + "が見つかりません。");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
