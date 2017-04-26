package chapter11.problem;

/**
 * 問題11-7
 * widthフィールドが123でheightフィールドが45であるような、Rectangleのインスタンスを表示したとき
 *     Rectangle(123, 45)
 * と表示されるようにしたい。どうプログラムすればよいか。
 *
 * @author shunji.yamaguchi
 *
 */
public class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle(" + width + ", " + height + ")";
    }

    /*テスト
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(123, 45);
        System.out.println(rect);
    }
    //*/
}
