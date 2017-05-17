package junitissues.issues04;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 【同値クラスに対するテスト】
 * 整数値を引数として持ち、偶数である場合にtrueを返すisEvenメソッドのテストを作成せよ。
 * isEvenメソッドはNumberUtilsクラスにstaticメソッドとして定義する。
 *
 * @author shunji.yamaguchi
 *
 */
public class NumberUtilsTest {
    @Test
    public void isEvenメソッドに10を与えるとtrueを返すこと() {
        assertThat(NumberUtils.isEven(10), is(true));
    }

    @Test
    public void isEvenメソッドに7を与えるとfalseを返すこと() {
        assertThat(NumberUtils.isEven(7), is(false));
    }
}
