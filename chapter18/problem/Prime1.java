package chapter18.problem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 問題18-3
   public class Prime1 {
       public static void main(String[] args) {
           if (args.length != 1) {
               System.out.println("使用法：java Prime1 作成ファイル");
               System.out.println("例：java Prime1 prime.txt");
               System.exit(0);
           }
           String filename = args[0];

           PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
           writePrime(writer);
           writer.close();
       }
       public static void writePrime(PrintWriter writer) {
           boolean[] prime = new boolean[MAX_PRIME];
           for (int n = 0; n < MAX_PRIME; n++) {
               prime[n] = true;
           }
           prime[0] = false;
           prime[1] = false;
           for (int n = 0; n < MAX_PRIME; n++) {
               if (prime[n]) {
                   // ここで n を出力する
                   for (int i = 2; i * n < MAX_PRIME; i++) {
                       prime[i * n] = false;
                   }
               }
           }
       }
   }
 *
 * 以上のプログラムはファイル名を指定すると、そのファイルに1000より小さい素数の表を
 * 書き出すプログラムであるが、まだ未完成である。java Prime1 prime.txt のように
 * 実行すると、以下の内容のprime.txtファイルが作成される予定である。
 * このプログラムを完成させよ。
 *
   2
   3
   7
   11
   ...（中略）...
   977
   983
   991
   997
 *
 * @author shunji.yamaguchi
 *
 */
public class Prime1 {
    public static final int MAX_PRIME = 1000;

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("使用法：java Prime1 作成ファイル");
            System.out.println("例：java chapter18/problem/Prime1 ../src/chapter18/problem/prime.txt");
            System.exit(0);
        }
        String filename = args[0];

        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
            writePrime(writer);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }

    public static void writePrime(PrintWriter writer) {
        boolean[] prime = new boolean[MAX_PRIME];
        for (int n = 0; n < MAX_PRIME; n++) {
            prime[n] = true;
        }
        prime[0] = false;
        prime[1] = false;
        for (int n = 0; n < MAX_PRIME; n++) {
            if (prime[n]) {
                writer.println(n);
                for (int i = 2; i * n < MAX_PRIME; i++) {
                    prime[i * n] = false;
                }
            }
        }
    }
}
