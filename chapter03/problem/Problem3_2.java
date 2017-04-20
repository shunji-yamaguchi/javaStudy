package chapter03.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem3_2 {
    /**
     * 問題3-2
     * 2人の年齢を入力すると、その2人の平均年齢を表示するプログラムを作成せよ。
     *
     * @param args
     */
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int age1;
            int age2;
            String line;

            System.out.println("1人目の年齢を入力してください。");
            line = reader.readLine();
            age1 = Integer.parseInt(line);

            System.out.println("2人目の年齢を入力してください。");
            line = reader.readLine();
            age2 = Integer.parseInt(line);

            double ageAverage = (double)(age1 + age2) / 2;
            System.out.println("2人の年齢の平均は " + ageAverage + " です。");
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("年齢が正しくありません。");
        }

    }
}
