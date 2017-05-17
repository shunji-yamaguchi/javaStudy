package junitissues.issues03;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * 【副作用を持つメソッドのテスト 】
 * Counterクラスのincrementメソッドは、呼び出すごとに１ずつ加算された値を返す。
 * このメソッドのテストを作成せよ。なお、初回のincrementメソッドの呼び出し時には１を返すこと。
 *
 * @author shunji.yamaguchi
 *
 */
public class CounterTest {
    private Counter counter;

    @Before
    public void インスタンス生成() {
        counter = new Counter();
    }

    @Test
    public void 初期状態でincrementメソッドを実行すると1を取得() {
        assertThat(counter.increment(), is(1));
    }

    @Test
    public void incrementメソッドを１回実行した状態でincrementメソッドを実行すると2を取得() {
        counter.increment();
        assertThat(counter.increment(), is(2));
    }

    @Test
    public void incrementメソッドを５０回実行した状態でincrementメソッドを実行すると51を取得() {
        for (int i = 0; i < 50; i++) {
            counter.increment();
        }
        assertThat(counter.increment(), is(51));
    }
}
