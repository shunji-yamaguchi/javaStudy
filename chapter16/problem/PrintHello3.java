package chapter16.problem;

/**
 * 問題16-3
 * 問題16-2で解答したLabelPrinterを使用して「おはよう！」「こんにちは！」「こんばんは！」
 * をそれぞれ表示するスレッドを3つ動かすクラスPrintHello3を宣言せよ。
 *
 * @author shunji.yamaguchi
 *
 */
public class PrintHello3 {
    public static void main(String[] args) {
        LabelPrinter th1 = new LabelPrinter("おはよう！");
        LabelPrinter th2 = new LabelPrinter("こんにちは！");
        LabelPrinter th3 = new LabelPrinter("こんばんは！");
        th1.start();
        th2.start();
        th3.start();
    }
}
