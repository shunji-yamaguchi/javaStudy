package chapter05.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 問題5-6
 * 以下のif文で書かれたプログラムをswitch文で書き換えよ
   public static void main(String[] arg) {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       try {
           System.out.println("飲み物は何が好きですか?");
           System.out.println("あ=オレンジジュース");
           System.out.println("い=コーヒー");
           System.out.println("う=どちらでもない");
           System.out.println("あ,い,うのどれかを選んでください。");
           String line = reader.readLine();
           if (line.equals("あ")) {
               System.out.println("オレンジジュースです。");
           } else if (line.equals("い")) {
               System.out.println("コーヒーです。");
           } else {
               System.out.println("どちらでもありません。");
           }
       } catch (IOException e) {
           System.out.println(e);
       }
   }
 * @author shunji.yamaguchi
 *
 */
public class Problem5_6 {
    public static void main(String[] arg) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("飲み物は何が好きですか?");
            System.out.println("あ=オレンジジュース");
            System.out.println("い=コーヒー");
            System.out.println("う=どちらでもない");
            System.out.println("あ,い,うのどれかを選んでください。");
            String line = reader.readLine();
            switch (line) {
            case "あ":
                System.out.println("オレンジジュースです。");
                break;
            case "い":
                System.out.println("コーヒーです。");
                break;
            default:
                System.out.println("どちらでもありません。");
                break;
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
