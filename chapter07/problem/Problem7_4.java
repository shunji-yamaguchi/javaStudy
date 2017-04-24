package chapter07.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 問題7-4
 * 以下のプログラムをcontinue文を使わない形式に書き換えよ
   public static void main(String[] arg) {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       try {
           String line;
           while ((line = reader.readLine()) != null) {
               if (!line.endsWith("{") && !line.endsWith("}")) {
                   continue;
               }
               System.out.println(line);
           }
       } catch (IOException e) {
           System.out.println(e);
       }
   }
 *
 * @author shunji.yamaguchi
 *
 */
public class Problem7_4 {
    public static void main(String[] arg) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.endsWith("{") || line.endsWith("}")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
