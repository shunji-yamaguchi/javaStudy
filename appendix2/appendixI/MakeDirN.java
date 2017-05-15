package appendix2.appendixI;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MakeDirN {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("使用例：java MakeDirN ディレクトリ名");
            System.out.println("例：java appendix2/appendixI/MakeDirN ../src/appendix2/appendixI/doc");
            System.exit(0);
        }
        String dirname = args[0];
        try {
            Path path = Files.createDirectory(Paths.get(dirname));
            System.out.println(dirname + "を作成しました。");
            System.out.println("絶対パスは" + path.toAbsolutePath() + "です。");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
