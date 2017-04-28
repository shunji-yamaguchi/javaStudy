package chapter13.problem;

/**
 * 問題13-3
 * 以下のようなプログラムを動かしてmethod1~method3のどこかでExceptionが投げられるとする。
 * 例外がどこで投げられたか、実行結果で判断できるようにmainメソッドを修正せよ。
 *
   public class ExceptionTest5 {
       public static void main(String[] args) {
           try {
               method1(0);
               method2(0);
               method3(0);
           } catch (Exception e) {
               System.out.println("例外:" + e);
           }
       }

       static void method1(int x) throws Exception {
           ・・・
       }

       static void method2(int x) throws Exception {
           ・・・
       }

       static void method3(int x) throws Exception {
           ・・・
       }
   }
 *
 * @author shunji.yamaguchi
 *
 */
public class ExceptionTest5 {
    public static void main(String[] args) {
        try {
            method1(0);
            method2(0);
            method3(0);
        } catch (Exception e) {
            System.out.println("例外:" + e);
            //e.printStackTrace(); // 別解
            System.out.println("スローポイント：" + e.getStackTrace()[0]);
        }
    }

    static void method1(int x) throws Exception {
        //int temp = 10 / x;
    }

    static void method2(int x) throws Exception {
        //int temp = 10 / x;
    }

    static void method3(int x) throws Exception {
        int temp = 10 / x;
    }
}
