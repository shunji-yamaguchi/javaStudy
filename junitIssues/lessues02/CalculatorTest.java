package junitIssues.lessues02;

import org.junit.Test;

/**
 * 【例外を送出するメソッドのテスト】
 * Calculatorクラスに整数の割り算を行うdivideメソッドを作成し、
 * 0で割る場合に例外が送出されることを検証するテストを作成せよ。
 * なお、整数の割り算は小数点以下を切り捨ててよい。
 *
 * @author shunji.yamaguchi
 *
 */
public class CalculatorTest {
    @Test(expected = IllegalArgumentException.class)
    public void 第２引数に0を指定してdivideを呼び出すとIllegalArgumentExceptionが発生() {
        new Calculator().divide(1, 0);
    }
}
