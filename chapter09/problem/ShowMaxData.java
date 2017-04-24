package chapter09.problem;

/**
 * 問題9-7
 * 以下のプログラムは配列dataの中で最も大きい数を表示するプログラムである。
 * ???の部分を埋めて完成させよ。
 *
 　public static void main(String[] args) {
       int[] data = {31, 41, 59, 26, 53, 58, 97, 93, 23, 84};
       int max_data = data[0];
       for (int i = 0; i < ???; i++) {
           ???
       }
       System.out.println("最大値は" + max_data + "です。");
   }
 *
 * @author shunji.yamaguchi
 *
 */
public class ShowMaxData {
    public static void main(String[] args) {
        int[] data = {31, 41, 59, 26, 53, 58, 97, 93, 23, 84};
        int max_data = data[0];
        for (int i = 0; i < data.length; i++) {
            if (max_data < data[i]) {
                max_data = data[i];
            }
        }
        System.out.println("最大値は" + max_data + "です。");
    }
}
