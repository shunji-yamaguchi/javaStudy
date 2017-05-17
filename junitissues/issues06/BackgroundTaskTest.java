package junitissues.issues06;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.lang.reflect.Field;

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
    public void invokeメソッドによりRunnableオブジェクトのrunメソッドが別スレッドで実行されること() throws Exception {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        };
        BackgroundTask backgroundTask = new BackgroundTask(task);
        backgroundTask.invoke();

        Thread taskThread = (Thread)getPrivateField(backgroundTask, "task");
        assertThat(taskThread.isAlive(), is(true));
    }

    // privateなフィールドを取得
    private static Object getPrivateField(Object target, String field) throws Exception {
        Class<? extends Object> c = target.getClass();
        Field fld = c.getDeclaredField(field);
        fld.setAccessible(true);
        return fld.get(target);
    }
}
