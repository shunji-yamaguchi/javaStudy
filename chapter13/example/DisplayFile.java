package chapter13.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DisplayFile {
    public static void main(String[] args) {
        for (String filename : args) {
            System.out.println("ファイル名" + filename + "====");
            try {
                BufferedReader reader = new BufferedReader(new FileReader(filename));
                while (true) {
                    String line = reader.readLine();
                    if (line == null) {
                        break;
                    }
                    System.out.println("line");
                }
                reader.close(); // JavaSE7からtry-with-resource文を使うと自動で呼び出される
            } catch (FileNotFoundException e) {
                System.out.println("ファイルが見つかりません;" + e);
            } catch (IOException e) {
                System.out.println("I/Oエラーです:" + e);
            }
        }
    }
}
