package chapter05.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 問題5-7
 * はじめに「0~6の数字を入力してください。対応した曜日を表示します。」と表示し、
 * キーボードから0~6の数字を入力すると、その数字に応じて
 * 「日曜日」「月曜日」~「土曜日」と表示して終了するプログラムを作成せよ。
 * ただし、0~6以外の数字では「0~6の範囲で入力してください」と表示し、
 * 数字以外の入力があった場合は「数字を入力してください」と表示して終了せよ。
 *
 * @author shunji.yamaguchi
 *
 */
public class Problem5_7 {
    public static void main(String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("0~6の数字を入力してください。対応した曜日を表示します。");
            String line = reader.readLine();
            int n = Integer.parseInt(line);

            String day;
            switch (n) {
            case 0:
                day = "日曜日";
                break;
            case 1:
                day = "月曜日";
                break;
            case 2:
                day = "火曜日";
                break;
            case 3:
                day = "水曜日";
                break;
            case 4:
                day = "木曜日";
                break;
            case 5:
                day = "金曜日";
                break;
            case 6:
                day = "土曜日";
                break;
            default:
                throw new IllegalArgumentException();
            }
            System.out.println(day);
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数字を入力してください");
        } catch (IllegalArgumentException e) {
            System.out.println("0~6の範囲で入力してください");
        }
    }
}
