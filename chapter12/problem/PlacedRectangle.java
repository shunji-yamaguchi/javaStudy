package chapter12.problem;

/**
 * 問題12-4
 * 次の機能を持つPlacedRectangleをRectangleのサブクラスとして宣言せよ。
 * ・位置を表すint型のフィールドx, yを持つ
 * ・3つのコンストラクタを持つ
 *   （1）引数なし
 *   （2）位置付き
 *   （3）位置と大きさ付き
 * ・位置を変更するメソッドsetLocationを持つ
 * ・標準的な文字列表現を返すメソッドtoStringを持つ
 *    x = 12, y = 34, width = 123, height = 45 のとき
 *    [（12, 34）[123, 45]] となるものとする
 *
 * @author shunji.yamaguchi
 *
 */
public class PlacedRectangle extends Rectangle {
    int x;
    int y;

    PlacedRectangle() {
        this(0, 0);
    }
    PlacedRectangle(int x, int y) {
        setLocation(x, y);
    }
    PlacedRectangle(int x, int y, int width, int height) {
        super(width, height);
        setLocation(x, y);
    }

    void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "[（" + x + ", " +  y +  "）" + super.toString() + "]";
    }

    /* テスト
    public static void main(String[] args) {
        PlacedRectangle pr = new PlacedRectangle(12, 34, 123, 45);
        System.out.println(pr);

        pr = new PlacedRectangle(12, 34);
        System.out.println(pr);

        pr = new PlacedRectangle();
        System.out.println(pr);
    }
    //*/
}
