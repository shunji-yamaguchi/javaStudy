package chapter08.problem;

/**
 * 問題8-2
   public static void printGraph(int x) {
       for (int i = 0; i < x; i++) {
           System.out.print("*");
       }
       System.out.println();
   }
 * 以上のメソッドprintGraphを使って、以下のような放物線を書くプログラムを作成せよ
   ****************************************************************
   *************************************************
   ************************************
   *************************
   ****************
   *********
   ****
   *

   *
   ****
   *********
   ****************
   *************************
   ************************************
   *************************************************
   ****************************************************************
 *
 * @author shunji.yamaguchi
 *
 */
public class Problem8_2 {
    public static void main(String[] args) {
        for (int i = -8; i <= 8; i++) {
            printGraph((int)Math.pow(i, 2));
        }
    }

    public static void printGraph(int x) {
        for (int i = 0; i < x; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
