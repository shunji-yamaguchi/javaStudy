package chapter18.problem;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 問題18-2
 * ファイル中に特定の文字を含んでいるかどうか調べるプログラムFindFile1を作成せよ。
 * 起動のときの引数は「java FindFile1 検索文字列 検索対象ファイル」のようにし、
 * 文字列が見つかった場合はその行番号と行そのものを表示せよ。
 * chapter07/example/Find1.java を参考にせよ。
 *
 * 以下は実行結果の例である。
   java FindFile1 System FindFile1.java
   6:            System.out.println("使用法：java FindFile1 検索文字列 検索対象ファイル");
   7:            System.out.println("例：java FindFile1 System FindFile1.java");
   8:            System.exit(0);
   19:                    System.out.println(linenum + ":" + line);
   25:            System.out.println(filename + "が見つかりません。");
   27:            System.out.println(e);
 *
 * @author shunji.yamaguchi
 *
 */
public class FindFile1 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("使用法：java FindFile1 検索文字列 検索対象ファイル");
            System.out.println("例：java chapter18/problem/FindFile1 System ../src/chapter18/problem/FindFile1.java");
            System.exit(0);
        }

        String findstring = args[0];
        String filename = args[1];
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filename));
            String line;
            for (int lineNum = 1; (line = reader.readLine()) != null; lineNum++) {
                int n = line.indexOf(findstring);
                if (n >= 0) {
                    System.out.println(lineNum + ":" + line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(filename + "が見つかりません。");
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
    }
}
