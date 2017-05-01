package chapter16.problem;

/**
 * 問題16-6で作成したクラスを、Runnableインタフェースを実装して作成せよ。
 *
 * @author shunji.yamaguchi
 *
 */
public class Problem16_7 implements Runnable {
    int time;
    String print;

    Problem16_7(int time, String print) {
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
        Problem16_7 pro1 = new Problem16_7(3000, "***");
        Thread th1 = new Thread(pro1);
        Problem16_7 pro2 = new Problem16_7(5000, "=====");
        Thread th2 = new Thread(pro2);
        th1.start();
        th2.start();
    }
}
