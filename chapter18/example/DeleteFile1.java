package chapter18.example;

import java.io.File;

public class DeleteFile1 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("使用法：java DeleteFile1 削除ファイル名");
            System.out.println("例：java chapter18/example/DeleteFile1 ../src/chapter18/example/output.txt");
            System.exit(0);
        }
        String filename = args[0];
        File file = new File(filename);
        if (file.delete()) {
            System.out.println(filename + "を削除しました。");
        } else {
            System.out.println(filename + "を削除できませんでした。");
        }
    }
}
