package chapter16.problem;

/**
 * 問題16-11
 * example.GoodBankTest.javaは、example.GoodBank.javaのインスタンスを生成して、
 * 預金の預け入れと引き出しを行いました。これを変更して銀行口座がたった1つしかない
 * プログラムにせよ。クラス名はOneBankTestとOneBankとすること。
 * ヒント：OneBankのフィールドやメソッドをstaticにし、それに合わせてOneBankTestを作成する。
 *
 * @author shunji.yamaguchi
 *
 */
public class OneBankTest extends Thread {
    @Override
    public void run() {
        while (true) {
            // 100円預け入れ
            OneBank.addMoney(100);
            // 100円引き出し
            OneBank.addMoney(-100);
        }
    }

    public static void main(String[] args) {
        new OneBankTest().start();
        new OneBankTest().start();
    }
}
