package junitissues.issues04;

/**
 * 【同値クラスに対するテスト】
 * 整数値を引数として持ち、偶数である場合にtrueを返すisEvenメソッドのテストを作成せよ。
 * isEvenメソッドはNumberUtilsクラスにstaticメソッドとして定義する。
 *
 * @author shunji.yamaguchi
 *
 */
public class NumberUtils {
    public static boolean isEven(int x) {
        if (x % 2 == 0) {
            return true;
        }
        return false;
    }
}
