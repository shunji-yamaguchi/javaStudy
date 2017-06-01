package chapter09.problem;

/**
 * 問題9-6
   public static void main(String[] args) {
       String[] message ???

       ???

       if (args.length != 1) {
           System.out.println("使い方：java SelectGreeting 番号");
           System.exit(0);
       }
       int num = Integer.parseInt( ??? );
       if (0 <= num && num < message.length) {
           System.out.println(message[num]);
       } else {
           System.out.println("番号は0~" + ??? + "の範囲で指定してください。");
       }
   }
 *
 * 以上のプログラムの???部分を完成させ、以下のような実行結果になるプログラムを作成せよ。
 *
   java chapter09.problem.SelectGreenting 0
   おはよう!
   java chapter09.problem.SelectGreenting 1
   こんにちは!
   java chapter09.problem.SelectGreenting 2
   こんばんは!
   java chapter09.problem.SelectGreenting 3
   番号は0~2の範囲で指定してください。
   java chapter09.problem.SelectGreenting -100
   番号は0~2の範囲で指定してください。
 *
 * @author shunji.yamaguchi
 *
 */
public class SelectGreeting {
    public static void main(String[] args) {
        String[] message = new String[3];
        message[0] = "おはよう！";
        message[1] = "こんにちは！";
        message[2] = "こんばんは！";

        if (args.length != 1) {
            System.out.println("使い方：java chapter09.problem.SelectGreeting 番号");
            System.exit(0);
        }

        int num = Integer.parseInt(args[0]);
        if (0 <= num && num < message.length) {
            System.out.println(message[num]);
        } else {
            System.out.println("番号は0~" + (message.length - 1) + "の範囲で指定してください。");
        }
    }
}
