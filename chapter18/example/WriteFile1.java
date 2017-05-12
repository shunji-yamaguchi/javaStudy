package chapter18.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class WriteFile1 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("使用法：java WriteFile1 作成ファイル");
            System.out.println("例：java chapter18/example/WriteFile1 ../src/chapter18/example/output.txt < ../src/chapter18/example/WriteFile1.java");
            System.exit(0);
        }
        String filename = args[0];
        BufferedReader reader = null;
        PrintWriter writer = null;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
            writer = new PrintWriter(new BufferedWriter(
                    new OutputStreamWriter(new FileOutputStream(new File(filename)), "UTF-8")));
            String line;
            while ((line = reader.readLine()) != null) {
                writer.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println(filename + "が見つかりません。");
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println(e);
            } finally {
                if (writer != null) {
                    writer.close();
                }
            }

        }
    }
}
