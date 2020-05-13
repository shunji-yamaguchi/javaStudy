package junitissues.issues02;

/**
 * 【例外を送出するメソッドのテスト】
 * Calculatorクラスに整数の割り算を行うdivideメソッドを作成し、
 * 0で割る場合に例外が送出されることを検証するテストを作成せよ。
 * なお、整数の割り算は小数点以下を切り捨ててよい。
 *
 * @author shunji.yamaguchi
 *
 */
public class Calculator {
    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException();
        }
        return num1 / num2;
    }
}
