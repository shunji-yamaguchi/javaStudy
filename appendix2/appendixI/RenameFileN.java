package appendix2.appendixI;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RenameFileN {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("使用例：java RenameFileN 現在のファイル名 新しいのファイル名");
            System.out.println("例：java appendix2/appendixI/RenameFileN ../src/appendix2/appendixI/output.txt ../src/appendix2/appendixI/newoutput.txt");
            System.exit(0);
        }
        String oldFilename = args[0];
        String newFilename = args[1];
        try {
            Path oldPath = Paths.get(oldFilename);
            Path newPath = Paths.get(newFilename);
            Files.move(oldPath , newPath);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
