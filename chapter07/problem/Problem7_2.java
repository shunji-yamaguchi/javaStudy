package chapter07.problem;

/**
 * 問題7-2
 * 次のプログラムをwhile文を使用するように修正せよ。
   public static void main(String[] args) {
       for (int i = 0; i < 10; i++) {
           for (int j = 0; j < i * i; j++) {
               System.out.print("*");
           }
           System.out.println();
       }
   }
 *
 * @author shunji.yamaguchi
 *
 */
public class Problem7_2 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            int j = 0;
            while (j < i * i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
