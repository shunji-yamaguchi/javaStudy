package chapter02.problem;

/**
 * 問題2-4
 * 以下のプログラムを正しい計算結果が表示されるよう修正せよ
 * public class CalcBig {
 *   public static void main(String[] arg){
 *     System.out.println(100000 * 100000);
 *   }
 * }
 *
 * @author shunji.yamaguchi
 *
 */
public class CalcBig {
  public static void main(String[] arg){
    System.out.println(100000L * 100000L);
  }
}
