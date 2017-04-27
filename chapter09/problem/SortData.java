package chapter09.problem;

/**
 * 問題9-8
 * 以下のプログラムは配列dataを昇順で並べるものである。
 * ???の部分を埋めて完成させよ。
 *
   public static void main(String[] args) {
       int[] data = {31, 41, 59, 26, 53, 58, 97, 93, 23, 84};
       System.out.println("並び替える前");
       for (int i = 0; i < data.length; i++) {
           System.out.print(data[i] + " ");
       }
       System.out.println();
       for (int i = 0; i < ???; i++) {
           for (int j = i + 1; j < ???; j++) {
               if (data[i] > data[j]) {
                   // 交換
                   ???
               }
           }
       }
       System.out.println("並び替えた後");
       for (int i = 0; i < data.length; i++) {
           System.out.print(data[i] + " ");
       }
       System.out.println();
   }
 *
 * @author shunji.yamaguchi
 *
 */
public class SortData {
    public static void main(String[] args) {
        int[] data = {31, 41, 59, 26, 53, 58, 97, 93, 23, 84};
        System.out.println("並び替える前");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();

        // バブルソート
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] > data[j]) {
                    // 交換
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
        System.out.println("並び替えた後");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
