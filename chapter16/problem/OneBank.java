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
public class OneBank {
    // 預金残高
    private static int value = 0;

    // 預け入れ・引き出し
    public static synchronized void addMoney(int money) {
        // 現在の残高を保存
        int currentValue = value;
        // 状況を表示
        System.out.println(Thread.currentThread() + "が addMoney に入りました。");
        // 現在の残高を変更
        value += money;
        // 矛盾がないかどうかチェック
        if (currentValue + money != value) {
            System.out.println(Thread.currentThread() + "で矛盾が発生しました！");
            System.exit(-1);
        }
        // 状況を表示
        System.out.println(Thread.currentThread() + "が addMoney から出ました。");
    }
}
