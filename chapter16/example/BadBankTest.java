package chapter16.example;

public class BadBankTest extends Thread {
    BadBank bank;

    public BadBankTest(BadBank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        while (true) {
            // 100円預け入れ
            bank.addMoney(100);
            // 100円引き出し
            bank.addMoney(-100);
        }
    }

    public static void main(String[] args) {
        BadBank bank = new BadBank(); // BadBank生成
        new BadBankTest(bank).start(); // 2つのスレッドで
        new BadBankTest(bank).start(); // 同じインスタンスを扱う
    }
}
