package chapter18.example;

import java.io.File;

public class MakeDir1 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("使用法：java MakeDir1 ディレクトリ名");
            System.out.println("例：java chapter18/example/MakeDir1 ../src/chapter18/example/doc");
            System.exit(0);
        }
        String dirname = args[0];
        File dir = new File(dirname);
        if (dir.mkdirs()) {
            System.out.println(dirname + "を作成しました。");
            System.out.println("絶対パスは" + dir.getAbsolutePath() + "です。");
        } else {
            System.out.println(dirname + "を作成できませんでした。");
        }
    }
}
