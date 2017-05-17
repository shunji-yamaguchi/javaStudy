package junitissues.issues06;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

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
        Task task = new Task();
        new BackgroundTask(task).invoke();

        try {
            int sleepTime = 300; // taskのrunが実行される前に、以下の処理が実行されないよう300ms待つ
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        if (task.executionThreadName == null) {
            fail();
        }
        assertThat(task.executionThreadName, is(not(Thread.currentThread().getName())));
    }

    class Task implements Runnable {
        String executionThreadName;

        @Override
        public void run() {
            executionThreadName = Thread.currentThread().getName();
        }
    }
}
