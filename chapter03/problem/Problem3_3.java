package chapter03.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 問題3-3
 * ユーザが入力した文字列の各文字の文字コードを表示するプログラムを作成せよ。
 *
 * @author shunji.yamaguchi
 *
 */
public class Problem3_3 {
    public static void main(String[] arg) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("文字列を入力してください。");
            String line = reader.readLine();

            char target;
            for (int i = 0; i < line.length(); i++) {
                target = line.charAt(i);
                System.out.println("\'" + target + "\' の文字コードは 0x" + Integer.toHexString((int)target) + "です。");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
