package appendix2.appendixI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteFileN {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("使用例：java WriteFileN 作成ファイル");
            System.out.println("例：java appendix2/appendixI/WriteFileN ../src/appendix2/appendixI/output.txt < ../src/appendix2/appendixI/WriteFileN.java");
            System.exit(0);
        }
        String filename = args[0];
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
                PrintWriter writer = new PrintWriter(Files.newBufferedWriter(Paths.get(filename), Charset.forName("UTF-8"), StandardOpenOption.CREATE_NEW));) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.println(line);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
