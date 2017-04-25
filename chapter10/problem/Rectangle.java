package chapter10.problem;

/**
 * 問題10-2
 * 次のような「長方形」クラスを宣言してください
 * ・クラス名はRectangle
 * ・「幅」を表すint型のフィールドwidthを持つ
 * ・「高さ」を表すint型のフィールドheightを持つ
 * ・幅と高さを指定するコンストラクタを持つ
 * ・幅が123で高さが45のとき、[ 123, 45 ] という文字列を得るためのtoStringメソッドを持つ
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
        return "[ " + width + ", " + height + " ]";
    }

    /* テスト用
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(123, 45);
        System.out.println(rect);
    }
    //*/
}
