package chapter12.problem;

/**
 * 問題12-4と問題12-5で使用するクラス
 *
 * @author shunji.yamaguchi
 *
 */
public class Rectangle {
    int width;
    int height;

    Rectangle() {
        setSize(0 ,0);
    }
    Rectangle(int width, int height) {
        setSize(width, height);
    }

    void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "[" + width + ", " + height + "]";
    }
}
