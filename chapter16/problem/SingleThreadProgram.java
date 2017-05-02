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
public class SingleThreadProgram implements Runnable {
    static Job[] jobs;
    int jobNumber;

    public SingleThreadProgram(int jobNumber) {
        if (jobs.length < jobNumber || jobNumber < 0) {
            this.jobNumber = -1;
        } else {
            this.jobNumber = jobNumber;
            jobs[jobNumber] = new Job(jobNumber);
        }
    }

    @Override
    public void run() {
        if (jobNumber != -1) {
            while (true) {
                jobs[jobNumber].work();
            }
        }
    }

    public static void newJobs(int jobcount) {
        jobs = new Job[jobcount];
    }

    public static void workAllJobs() {
        for (int i = 0; i < jobs.length; i++) {
            new Thread(new SingleThreadProgram(i)).start();
        }
    }

    public static void main(String[] args) {
        newJobs(10);
        workAllJobs();
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
