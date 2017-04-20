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
    public static void main(String[] arg){
        System.out.println("文字列を入力してください。");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = reader.readLine();

            for(int i = 0; i < line.length(); i++){
                System.out.println("\'" + line.charAt(i) + "\' の文字コードは "
                        + (int)line.charAt(i) + "です。");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
