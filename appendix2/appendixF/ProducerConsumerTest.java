package appendix2.appendixF;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ProducerConsumerTest {
    private BlockingQueue<Integer> queue;
    private Producer producer;
    private Consumer consumer;
    private int capacity;
    private static ByteArrayOutputStream out;

    @BeforeClass
    public static void 標準出力切り替え() {
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Before
    public void 各インスタンスを生成しoutをリセット() {
        out.reset();
        capacity = 3;
        queue = new ArrayBlockingQueue<Integer>(capacity);
        producer = new Producer(queue);
        consumer = new Consumer(queue);
    }

    @Test
    public void Consumerのqueueの型判定() {
        assertThat(consumer.queue, isA(BlockingQueue.class));
    }

    @Test
    public void Producerのqueueの型判定() {
        assertThat(producer.queue, isA(BlockingQueue.class));
    }

    @Test
    public void Consumerのqueueのcapacity判定() {
        assertThat(consumer.queue.remainingCapacity(), is(capacity));
    }

    @Test
    public void Producerのqueueのcapacity判定() {
        assertThat(producer.queue.remainingCapacity(), is(capacity));
    }

    @Test
    public void ProducerのProducerENDはマイナス1() {
        assertThat(Producer.END, is(-1));
    }

    @Test
    public void Consumerのconsumerメソッドの表示文字列判定() {
        consumer.consume(0);
        assertThat(out.toString(), is("Consumer:" + consumer.getName() + "は 0 を消費中" + System.lineSeparator()));
    }

    @Test
    public void Producerのproducerメソッドの表示文字列判定() {
        producer.produce(0);
        assertThat(out.toString(), is("Producer:" + producer.getName() + "は 0 を生産完了" + System.lineSeparator()));
    }

    @Test
    public void Producerのrun動作確認() {
        producer.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    int count = 0;
                    while (count < 100) {
                        queue.take();
                        count++;
                    }
                } catch (InterruptedException e) {
                }
            }
        }).start();

        while (producer.isAlive()) {
        }

        // 生成した数字0~99を引数にproducerを呼び出しているか
        String producerString = out.toString();
        out.reset();
        for (int i = 0; i < 100; i++) {
            producer.produce(i);
        }
        assertThat(out.toString(), is(producerString));
    }

    @Test
    public void Consumerのrun動作確認() {
        consumer.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 100; i++) {
                        queue.put(i);
                    }
                    queue.put(Producer.END);
                } catch (InterruptedException e) {
                }
            }
        }).start();

        while (consumer.isAlive()) {
        }

        // 取り出した数字0~99を引数に、consumeを呼び出しているか
        String consumerString = out.toString();
        out.reset();
        for (int i = 0; i < 100; i++) {
            consumer.consume(i);
        }
        assertThat(out.toString(), is(consumerString));
    }
}
