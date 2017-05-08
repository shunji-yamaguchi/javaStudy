package chapter16.example;

public class JoinTest extends Thread {
    public static void main(String[] args) {
        JoinTest th = new JoinTest();
        System.out.println("main：はじめ");
        th.start();
        System.out.println("main：終了待ちに入る");
        try {
            th.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("main：おわり");
    }

    @Override
    public void run() {
        System.out.println("run：スレッド開始");
        try {
            Thread.sleep(5000);
            //TimeUnit.SECONDS.sleep(5); // 5秒スリープ別解
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("run：スレッド終了");
    }
}
