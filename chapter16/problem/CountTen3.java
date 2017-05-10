package chapter16.problem;

/**
 * 問題16-5
 * example.CountTenA.javaでは、runメソッドを実行しているのは1つのスレッドだった。
 * 新たなスレッドを1つだけ生成するのではなく、3個生成して動作するよう書き換えよ。
 * クラス名はCountTen3とする。
 * その際、Threadクラスには自分のスレッド名を得る public final String getName()
 * メソッドがある。これを利用し、表示を行っているスレッドがわかるようにせよ。
 * 必要なら現在のスレッドを得る public static Thread currentThread() も利用せよ。
 *
 * @author shunji.yamaguchi
 *
 */
public class CountTen3 extends Thread {
    public static void main(String[] args) {
        CountTen3 ct1 = new CountTen3();
        CountTen3 ct2 = new CountTen3();
        CountTen3 ct3 = new CountTen3();
        ct1.start();
        ct2.start();
        ct3.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "：main：i = " + i);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "：run：i = " + i);
        }
    }
}
