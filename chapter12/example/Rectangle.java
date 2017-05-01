package chapter12.example;

public class Rectangle {
    private int width;
    private int height;

    Rectangle() {
        setSize(0, 0);
    }
    Rectangle(int width, int height) {
        setSize(width, height);
    }

    void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int getWidth() {
        return width;
    }

    int getHeight() {
        return height;
    }
}
