package chapter13.problem;

/**
 * 問題13-2
 * 以下のExceptionTest3の例外処理をmainメソッドからmyAssignメソッドに移せ。
 * すなわち、mainメソッドにはmyAssignの呼び出しだけ置き、
 * tryはmyAssignメソッド中におさめよ。
 *
   public class ExceptionTest3 {
       public static void main(String[] args) {
           int[] myarray = new int[3];
           try {
               System.out.println("代入します");
               myAssign(myarray, 100, 0);
               System.out.println("代入しました");
           } catch (ArrayIndexOutOfBoundsException e) {
               System.out.println("代入できませんでした");
               System.out.println("例外は" + e + "です");
       　  }
           System.out.println("終了します");
       }

       static void myAssign(int[] arr, int index, int value) {
           System.out.println("myAssignに来ました");
           arr[index] = value;
           System.out.println("myAssignから帰ります");
       }
　 }
 *
 * @author shunji.yamaguchi
 *
 */

public class ExceptionTest3 {
    public static void main(String[] args) {
        int[] myarray = new int[3];
        myAssign(myarray, 100, 0);
        System.out.println("終了します");
    }

    static void myAssign(int[] arr, int index, int value) {
        System.out.println("myAssignに来ました");
        try {
            System.out.println("代入します");
            arr[index] = value;
            System.out.println("代入しました");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("代入できませんでした");
            System.out.println("例外は" + e + "です");
        }
        System.out.println("myAssignから帰ります");
    }
}
