package chapter18.example;

import java.io.File;

public class RenameFile2 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("使用法：java RenameFile1 現在のファイル名 新しいファイル名");
            System.out.println("例：java chapter18/example/RenameFile2 ../src/chapter18/example/output.txt ../src/chapter18/example/outputRe.txt");
            System.exit(0);
        }
        String oldFilename = args[0];
        String newFilename = args[1];
        File oldFile = new File(oldFilename);
        File newFile = new File(newFilename);
        if (!oldFile.exists()) {
            System.out.println(oldFilename + "が見つかりません。");
        } else if (newFile.exists()) {
            System.out.println(newFilename + "はすでに存在します。");
        } else if (oldFile.renameTo(newFile)) {
            System.out.println(oldFilename + "を" + newFilename + "に変更しました。");
        } else {
            System.out.println(oldFilename + "を" + newFilename + "に変更できませんでした。");
        }
    }
}
