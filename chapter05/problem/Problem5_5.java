package chapter05.problem;

/**
 * 問題5-5
 * 以下のswitch文をif文で書き換えよ
   switch (c) {
       case '1':
       case 'a':
           System.out.println("オレンジジュースです。");
           break;
       case '2':
       case 'b':
           System.out.println("コーヒーです。");
           break;
       default:
           System.out.println("どちらでもありません。");
           break;
   }
 *
 * @author shunji.yamaguchi
 *
 */
public class Problem5_5 {
    public static void main(String[] args) {
        char c = '1';
        if (c == '1' || c == 'a') {
            System.out.println("オレンジジュースです。");
        } else if (c == '2' || c == 'b') {
            System.out.println("コーヒーです。");
        } else {
            System.out.println("どちらでもありません。");
        }
    }
}
