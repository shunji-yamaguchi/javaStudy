package chapter16.problem;

/**
 * 問題16-2
 * 「こんにちは！」というあいさつを1秒おきに表示するPrintHelloクラスと、それを
 * 実現するスレッドとなるLabelPrintクラスを以下のように作成した。
 * まだ誤りがあるので、正しく修正せよ。
 *
   class LabelPrinter {
       String label = "no label";

       LabelPrinter(String label) {
           this.label = label;
       }

       @Override
       public static void run() {
           while (true) {
               System.out.println(label);
               Thread.sleep(1000);
           }
       }
   }

   public class PrintHello {
       public static void main(String[] args) {
           LabelPrinter th = new LabelPrinter("こんにちは！");
           th.start();
       }
   }
 *
 * @author shunji.yamaguchi
 *
 */
class LabelPrinter extends Thread {
    String label = "no label";

    LabelPrinter(String label) {
        this.label = label;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(label);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class PrintHello {
    public static void main(String[] args) {
        LabelPrinter th = new LabelPrinter("こんにちは！");
        th.start();
    }
}
