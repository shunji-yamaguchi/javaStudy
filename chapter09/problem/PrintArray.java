package chapter09.problem;

/**
 * 問題9-9
   public static void main(String[] args) {
       int[][] arr = {
               {3, 1, 4, 1,},
               {5, 9, 2,},
               {6, 5,},
               {3,},
       };
       printArray(arr);
   }
   public static void printArray( ??? ){
       System.out.println("{");
       for (int i = 0; ???; i++) {
           System.out.print( ??? );
           for (int j = 0; ???; j++) {
               System.out.print( ??? );
           }
           System.out.println( ??? );
       }
       System.out.println("}");
   }
 *
 * 以上のプログラムはint型の二次元配列の内容を、以下のように表示するものである。
 * ???の部分を埋めて完成させよ。
 *
   {
       { 3, 1, 4, 1, },
       { 5, 9, 2, },
       { 6, 5, },
       { 3, },
   }
 *
 * @author shunji.yamaguchi
 *
 */
public class PrintArray {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 1, 4, 1,},
                {5, 9, 2,},
                {6, 5,},
                {3,},
        };
        printArray(arr);
    }

    public static void printArray(int[][] arr){
        System.out.println("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t{ ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println("},");
        }
        System.out.println("}");
    }
}
