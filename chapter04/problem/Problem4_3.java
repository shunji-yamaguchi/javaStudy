package chapter04.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 問題4-3
 * 現在の時刻（時のみ）をキーボードから入力すると
 *    0時~11時 → おはようございます
 *   12時      → お昼です
 *   13時~18時 → こんにちは
 *   19時~24時 → こんばんは
 *   それ以外  → 時間の範囲を超えています
 * と表示されるプログラムを作成せよ。
 *
 * @author shunji.yamaguchi
 *
 */
public class Problem4_3 {
    public static void main(String[] arg) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("現在の時刻を入力してください。");
            String line = reader.readLine();
            int time = Integer.parseInt(line);

            if (0 <= time && time <= 11) {
                System.out.println("おはようございます");
            } else if (time == 12) {
                System.out.println("お昼です");
            } else if (13 <= time && time <= 18) {
                System.out.println("こんにちは");
            } else if (19 <= time && time <= 24) {
                System.out.println("こんばんは");
            } else {
                System.out.println("時間の範囲を超えています");
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数字の形式が正しくありません。");
        }
    }
}
