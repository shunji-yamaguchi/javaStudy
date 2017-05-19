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
    @Test
    public void invokeメソッドによりRunnableオブジェクトのrunメソッドが別スレッドで実行されること() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        StringBuilder taskExecutionThreadName = new StringBuilder();

        Runnable task = () -> {
            taskExecutionThreadName.append(Thread.currentThread().getName());
            countDownLatch.countDown();
        };
        new BackgroundTask(task).invoke();

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        assertThat(taskExecutionThreadName.toString(), is(not(Thread.currentThread().getName())));
    }
}
