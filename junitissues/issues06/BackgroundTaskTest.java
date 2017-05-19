package junitissues.issues06;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.concurrent.CountDownLatch;

import org.junit.Test;

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
public class BackgroundTaskTest {
    private static final int COUNT_NUM = 1;
    private static CountDownLatch countDownLatch = new CountDownLatch(COUNT_NUM);
    private static String taskExecutionThreadName;

    @Test
    public void invokeメソッドによりRunnableオブジェクトのrunメソッドが別スレッドで実行されること() {
        Runnable task = () -> {
            taskExecutionThreadName = Thread.currentThread().getName();
            countDownLatch.countDown();
        };
        new BackgroundTask(task).invoke();

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        assertThat(taskExecutionThreadName, is(not(Thread.currentThread().getName())));
    }
}
