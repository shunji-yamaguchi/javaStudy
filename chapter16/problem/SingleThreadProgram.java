package chapter16.problem;

/**
 * 問題16-10
 * 以下のSingleThreadProgramクラスは、Jobというクラスのオブジェクトを10個作って
 * workというメソッドを呼び続けるものです。現在は、シングルスレッドのプログラムで
 * 複数の仕事をfor文でぐるぐる実行しています。これをマルチスレッドに書き換えよ。
 * クラスJobはどこかで宣言されているものとする。
 *
   public class SingleThreadProgram {
       Job[] jobs;

       public SingleThreadProgram(int jobcount) {
           jobs = new Job[jobcount];
           for (int i = 0; i < jobcount; i++) {
               jobs[i] = new Job(i);
           }
       }

       public void workAllJobs() {
           for (int i = 0; i < jobs.length; i++) {
               jobs[i].work();
           }
       }

       public static void main(String[] args) {
           SingleThreadProgram self = new SingleThreadProgram(10);
           while (true) {
               self.workAllJobs();
           }
       }
   }
 *
 * @author shunji.yamaguchi
 *
 */
public class SingleThreadProgram {
    JobThread[] jobs;

    public SingleThreadProgram(int jobcount) {
        jobs = new JobThread[jobcount];
        for (int i = 0; i < jobcount; i++) {
            jobs[i] = new JobThread(i);
        }
    }

    public void workAllJobs() {
        for (int i = 0; i < jobs.length; i++) {
            jobs[i].start();
        }
    }

    public static void main(String[] args) {
        SingleThreadProgram self = new SingleThreadProgram(10);
        self.workAllJobs();
    }
}

class JobThread extends Thread {
    Job job;

    public JobThread(int num) {
        this.job = new Job(num);
    }

    @Override
    public void run() {
        while (true) {
            job.work();
        }
    }
}

// テスト用
class Job {
    int num;

    Job(int num) {
        this.num = num;
    }

    void work() {
        System.out.println("work：" + num);
    }
}
