package junitissues.issues03;

/**
 * 【副作用を持つメソッドのテスト 】
 * Counterクラスのincrementメソッドは、呼び出すごとに１ずつ加算された値を返す。
 * このメソッドのテストを作成せよ。なお、初回のincrementメソッドの呼び出し時には１を返すこと。
 *
 * @author shunji.yamaguchi
 *
 */
public class Counter {
    private int count;

    public Counter() {
        this.count = 0;
    }

    public int increment() {
        return ++count;
    }
}
