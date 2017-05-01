package chapter12.problem;

/**
 * 問題12-5
 * 問題12-4のPlacedRectangle2をRectangleのサブクラスでなく
 * Rectangle型のインスタンス変数を持つクラスとして宣言せよ
 *
 * @author shunji.yamaguchi
 *
 */
public class PlacedRectangle2 {
    int x;
    int y;
    Rectangle rect;

    PlacedRectangle2() {
        this(0, 0);
    }

    PlacedRectangle2(int x, int y) {
        setLocation(x, y);
        rect = new Rectangle();
    }

    PlacedRectangle2(int x, int y, int width, int height) {
        setLocation(x, y);
        rect = new Rectangle(width, height);
    }

    void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "[（" + x + ", " + y + "）" + rect + "]";
    }

    /* テスト
    public static void main(String[] args) {
        PlacedRectangle2 pr = new PlacedRectangle2(12, 34, 123, 45);
        System.out.println(pr);

        pr = new PlacedRectangle2(12, 34);
        System.out.println(pr);

        pr = new PlacedRectangle2();
        System.out.println(pr);
    }
    //*/
}
