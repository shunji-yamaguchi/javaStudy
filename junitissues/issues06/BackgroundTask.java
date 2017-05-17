package junitissues.issues06;

/**
 * 【マルチスレッドのテスト 】
 * 処理をバックグラウンドのスレッドで非同期に実行したい。
 * バックグラウンドスレッドで処理するBackgroundTaskクラスを作成し、
 * タスクがバックグラウンドのスレッドで実行されることを検証するテストを作成せよ。
 * なお、タスクはRunnableオブジェクトに実装する
 *
 * @author shunji.yamaguchi
 *
 */
public class BackgroundTask {
    private Thread thread;

    public BackgroundTask(Runnable task) {
        this.thread = new Thread(task);
    }

    public void invoke() {
        thread.start();
    }
}
