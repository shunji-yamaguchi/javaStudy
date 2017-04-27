package chapter11.example;

public class Rectangle {
    final int INITIAL_WIDTH = 10;
    final int INITIAL_HEIGHT = 20;

    static int counter = 0;

    int number;
    int width;
    int height;

    Rectangle() {
        this.width = INITIAL_WIDTH;
        this.height = INITIAL_HEIGHT;
        setNumber();
    }
    Rectangle(int w, int h) {
        this.width = w;
        this.height = h;
        setNumber();
    }

    void setNumber() {
        number = counter;
        counter++;
    }

    void setSize(int w, int h) {
        width = w;
        height = h;
    }

    int getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "[ width = " + width + ", height = " + height + " ]";
    }

    static int getArea(Rectangle obj) {
        return obj.width * obj.height;
    }

    static int getCounter() {
        return counter;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println("r1.width = " + r1.width);
        System.out.println("r1.height = " + r1.height);
        System.out.println("r1.getArea() = " + r1.getArea());
        Rectangle r2 = new Rectangle(123, 45);
        System.out.println("r2.width = " + r2.width);
        System.out.println("r2.height = " + r2.height);
        System.out.println("r2.getArea() = " + r2.getArea());
    }
}
