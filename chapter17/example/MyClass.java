package chapter17.example;

public class MyClass {
    private MyClass() {
    }

    public MyClass(String s) {
        this();
    }

    public MyClass(String s, boolean append) {
        this();
    }
}
