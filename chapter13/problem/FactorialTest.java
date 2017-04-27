package chapter13.problem;

/**
 * 問題13-4
 * 10の階乗を求めるつもりで以下のプログラムを動かしたところ、
 * StackOverflowErrorという例外が投げられた。
 * 10の階乗を求めるようにプログラムを正しく修正せよ。
 *
   public class FactorialTest {
       public static void main(String[] args) {
           System.out.println(factorial(10));
       }

       public static int factorial(int n) {
           return n * factorial(n - 1);
       }
   }
 * @author shunji.yamaguchi
 *
 */
public class FactorialTest {
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }

    public static int factorial(int n) {
        return n > 1 ? n * factorial(n - 1) : 1;
    }
}
