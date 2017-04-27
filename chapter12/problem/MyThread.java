package chapter12.problem;

/**
 * 問題12-3
 * 参考書を読んでいると「ThreadクラスのサブクラスとしてMyThreadというクラスを宣言し、
 * runというメソッドをオーバーライドせよ。runは引数がなく、戻り値がvoid型のpublicな
 * メソッドです。」と書いてあった。この文章からどのようなプログラムが想像できるか。
 *
 * @author shunji.yamaguchi
 *
 */
public class MyThread extends Thread {
    @Override
    public void run() {
    }
}
