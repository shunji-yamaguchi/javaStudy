package junitissues.issues06;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
    private static ExecutorService executor = Executors.newCachedThreadPool();

    public Runnable task;

    public BackgroundTask(Runnable task) {
        this.task = task;
    }

    public void invoke() {
        executor.execute(task);
    }
}
