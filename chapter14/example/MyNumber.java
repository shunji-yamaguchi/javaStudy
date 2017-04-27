package chapter14.example;

public class MyNumber implements DebugPrintable {
    int a;

    public MyNumber(int a) {
        this.a = a;
    }

    @Override
    public void debugPrint() {
        System.out.println("MyNumberのインスタンス：aの値は " + a + "です。");
    }
}
