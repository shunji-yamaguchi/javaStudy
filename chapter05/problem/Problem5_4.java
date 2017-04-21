package chapter05.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 問題5-4
   public static void main(String[] arg) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("飲み物は何が好きですか?");
            System.out.println("1 オレンジジュース");
            System.out.println("2 コーヒー");
            System.out.println("3 どちらでもない");
            System.out.println("1,2,3のどれかを選んでください。");
            String line = reader.readLine();
            int n = Integer.parseInt(line);
            switch (n) {
            case 1:
                System.out.println("オレンジジュースです。");
                break;
            case 2:
                System.out.println("コーヒーです。");
                break;
            default:
                System.out.println("どちらでもありません。");
                break;
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数字の形式が正しくありません。");
        }
   }
 * 以上のプログラムを
 *   1なら「オレンジジュースです。」、2なら「コーヒーです。」
 *   3なら「ミルクです。」、4なら「どれでもありません。」
 * と表示されるように変更せよ。
 *
 * @author shunji.yamaguchi
 *
 */
public class Problem5_4 {
    public static void main(String[] arg) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("飲み物は何が好きですか?");
            System.out.println("1 オレンジジュース");
            System.out.println("2 コーヒー");
            System.out.println("3 ミルク");
            System.out.println("4 どちらでもない");
            System.out.println("1,2,3,4のどれかを選んでください。");
            String line = reader.readLine();
            int n = Integer.parseInt(line);
            switch (n) {
            case 1:
                System.out.println("オレンジジュースです。");
                break;
            case 2:
                System.out.println("コーヒーです。");
                break;
            case 3:
                System.out.println("ミルクです。");
                break;
            default:
                System.out.println("どちらでもありません。");
                break;
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数字の形式が正しくありません。");
        }
    }
}
