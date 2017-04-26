package chapter11.problem;

/**
 * 本文中で宣言したRectangleクラスは幅と高さを持つ長方形でした。
 * これに「左上すみの位置」を表すxとyというフィールドを追加せよ。
 * そして以下のコンストラクタとメソッドを宣言せよ
 * [1] フィールド
 *     [1a] 指定がないときの幅と高さ（INITIAL_WIDTH, INITIAL_HEIGHT）
 * [2] コンストラクタ
 *     [2a] 引数がないもの（width, heightの初期値はINITIAL_WIDTH, INITIAL_HEIGHT、x, yは0）
 *     [2b] width, heightだけ指定したもの（x, yは0）
 *     [2c] x, y, width, heightを指定したもの
 * [3] フィールド
 *     [3a] 位置を指定するvoid setLocation(int x, int y)メソッド
 *     [3b] 大きさを指定するvoid setSize(int width, int height)メソッド
 *     [3c] [x, y, width, height]の形式で文字列として表現するtoStringメソッド
 *     [3d] 長方形の「重なり部分」（これも長方形）を得る
 *          intersect(Rectangle r)メソッド、重なりがないときはnullを返す
 *
 * 【注意】コンピュータグラフィックスで使われる座標系を使用
 *         原点が左上、xは右にyは下にいくほど大きくなる
 *
 * @author shunji.yamaguchi
 *
 */
public class Rectangle3 {
    final int INITIAL_WIDTH = 10;
    final int INITIAL_HEIGHT = 20;

    int x;
    int y;
    int width;
    int height;

    public Rectangle3() {
        setLocation(0, 0);
        setSize(INITIAL_WIDTH, INITIAL_HEIGHT);
    }

    public Rectangle3(int width, int height) {
        setLocation(0, 0);
        setSize(width, height);
    }

    public Rectangle3(int x, int y, int width, int height) {
        setLocation(x, y);
        setSize(width, height);
    }

    void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "[" + x + ", " + y + ", " + width + ", " + height + "]";
    }

    Rectangle3 intersect(Rectangle3 r) {
        int thisRightX = this.x + this.width;
        int thisUnderY = this.y + this.height;
        int rRightX = r.x + r.width;
        int rUnderY = r.y + r.height;

        if (this.x > rRightX || r.x > thisRightX && this.y > rUnderY || r.y > thisUnderY) {
            return null;
        }

        int argX = Math.max(r.x, this.x);
        int argWidth = Math.min(rRightX, thisRightX) - argX;

        int argY = Math.max(r.y, this.y);
        int argHeight = Math.min(rUnderY, thisUnderY) - argY;

        return new Rectangle3(argX, argY, argWidth, argHeight);
    }

    ///* テスト
    public static void main(String[] args) {
        Rectangle3 rect1 = new Rectangle3(0, 0, 10, 10);

        Rectangle3 rect2 = new Rectangle3(-10, -10, 30, 30);
        System.out.println("大" + rect2.intersect(rect1));

        rect2.setLocation(-25, -10);
        System.out.println("左" + rect2.intersect(rect1));
        rect2.setLocation(5, -10);
        System.out.println("右" + rect2.intersect(rect1));
        rect2.setLocation(-10, -25);
        System.out.println("上" + rect2.intersect(rect1));
        rect2.setLocation(-10, 5);
        System.out.println("下" + rect2.intersect(rect1));
        rect2.setLocation(11, 11);
        System.out.println(rect2.intersect(rect1));

        System.out.println("----------------");

        rect2.setLocation(5, 5);
        rect2.setSize(2, 2);
        System.out.println("小" + rect2.intersect(rect1));

        rect2.setLocation(-1, 5);
        System.out.println("左" + rect2.intersect(rect1));
        rect2.setLocation(5, -1);
        System.out.println("上" + rect2.intersect(rect1));
        rect2.setLocation(9, 5);
        System.out.println("右" + rect2.intersect(rect1));
        rect2.setLocation(5, 9);
        System.out.println("下" + rect2.intersect(rect1));

        rect2.setLocation(-1, -1);
        System.out.println("左上" + rect2.intersect(rect1));
        rect2.setLocation(9, -1);
        System.out.println("右上" + rect2.intersect(rect1));
        rect2.setLocation(9, 9);
        System.out.println("右下" + rect2.intersect(rect1));
        rect2.setLocation(-1, 9);
        System.out.println("左下" + rect2.intersect(rect1));
        rect2.setLocation(-3, -3);
        System.out.println(rect2.intersect(rect1));
    }
    //*/
}
