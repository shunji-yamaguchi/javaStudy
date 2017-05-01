package chapter12.example;

public class NamedRectangle extends Rectangle {
    String name;

    NamedRectangle() {
        this("NO NAME");
    }
    NamedRectangle(String name) {
        super(200, 32);
        this.name = name;
    }

    void goodMethod() {
        setSize(456, 78);
        System.out.println(getHeight());
    }
}
