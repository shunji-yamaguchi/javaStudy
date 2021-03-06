package chapter09.problem;

/**
 * 問題9-5
 * 以下のプログラムを実行するとArrayIndexOutOfBoundsException: 5
 * と表示され計算結果が表示されない。計算結果が表示されるよう修正せよ。
 *
   public static void main(String[] args) {
       double[] data;
       data = new double[5];
       data[0] = 3.1;
       data[1] = 4.1;
       data[2] = 5.9;
       data[3] = 2.6;
       data[4] = 5.3;
       data[5] = 9.7;
       double sum = 0.0;
       for (int i = 0; i <= data.length; i++) {
           sum += data[i];
       }
       System.out.println("sum = " + sum);
   }
 *
 * @author shunji.yamaguchi
 *
 */
public class Problem9_5 {
    public static void main(String[] args) {
        double[] data;
        data = new double[6];
        data[0] = 3.1;
        data[1] = 4.1;
        data[2] = 5.9;
        data[3] = 2.6;
        data[4] = 5.3;
        data[5] = 9.7;
        double sum = 0.0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        System.out.println("sum = " + sum);
    }
}
