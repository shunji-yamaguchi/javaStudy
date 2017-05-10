package chapter16.problem;

/**
 * 問題16-6
 * 約3秒ごとに"***"を10回表示するスレッドと、約5秒ごとに"====="を10回表示するスレッドを、
 * それぞれ1つずつ動かすクラスをThreadクラスの拡張クラスとして作成せよ。
 *
 * @author shunji.yamaguchi
 *
 */
public class Problem16_6 extends Thread {
    int time;
    String print;

    Problem16_6(int time, String print) {
        this.time = time;
        this.print = print;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(print);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
            }
        }
    }

    public static void main(String[] args) {
        Problem16_6 th1 = new Problem16_6(3000, "***");
        Problem16_6 th2 = new Problem16_6(5000, "=====");
        th1.start();
        th2.start();
    }
}
