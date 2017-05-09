package chapter18.example;

import java.io.File;

public class RenameFile1 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("使用法：java RenameFile1 現在のファイル名 新しいファイル名");
            System.out.println("例：java chapter18/example/RenameFile1 ../src/chapter18/example/output.txt ../src/chapter18/example/outputRe.txt");
            System.exit(0);
        }
        String oldFilename = args[0];
        String newFilename = args[1];
        File oldFile = new File(oldFilename);
        File newFile = new File(newFilename);
        if (oldFile.renameTo(newFile)) {
            System.out.println(oldFilename + "を" + newFilename + "に変更しました。");
        } else {
            System.out.println(oldFilename + "を" + newFilename + "に変更できませんでした。");
        }
    }
}
