package appendix2.appendixH;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.NoSuchFileException;

public class ShowFileX {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("使用例：java ShowFileX ファイル");
            System.out.println("例：java appendix2/appendixH/ShowFileX ../src/appendix2/appendixH/ShowFileX.java");
            System.exit(0);
        }
        String filename = args[0];
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) { // try直後のカッコ内でリソースを確保すると、自動でcloseを呼び出してくれる
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (NoSuchFileException e) {
            System.out.println(filename + "が見つかりません。");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
