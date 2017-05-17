package junitissues.issues02;

import org.junit.Before;
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
    private Calculator calculator;

    @Before
    public void インスタンス生成() {
        calculator = new Calculator();
    }

    @Test(expected = IllegalArgumentException.class)
    public void 第２引数に0を指定してdivideを呼び出すとIllegalArgumentExceptionが発生() {
        calculator.divide(1, 0);
    }
}
