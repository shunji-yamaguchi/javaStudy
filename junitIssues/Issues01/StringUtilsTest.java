package junitIssues.issues01;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 【状態を持たないメソッドのテスト】
 * 文字列をスネークケース（すべて小文字で単語区切りがアンダースコア）に
 * 変換するユーティリティメソッドのテストを作成せよ。
 *
 * @author shunji.yamaguchi
 *
 */
public class StringUtilsTest {
    @Test
    public void aaaを入力するとaaaを取得() {
        assertThat(StringUtils.toSnakeCase("aaa"), is("aaa"));
    }

    @Test
    public void HelloWorldを入力するとhello_worldを取得() {
        assertThat(StringUtils.toSnakeCase("HelloWorld"), is("hello_world"));
    }

    @Test
    public void practiceJunitを入力するとpractice_junitを取得() {
        assertThat(StringUtils.toSnakeCase("practiceJunit"), is("practice_junit"));
    }
}
