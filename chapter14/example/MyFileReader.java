package chapter14.example;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class MyFileReader extends FileReader implements DebugPrintable {
    String filename = null;

    public MyFileReader(String filename) throws FileNotFoundException {
        super(filename);
        this.filename = filename;
    }

    @Override
    public void debugPrint() {
        System.out.println("MyFileReaderのインスタンス：ファイル名は " + filename + "です。");
    }
}
