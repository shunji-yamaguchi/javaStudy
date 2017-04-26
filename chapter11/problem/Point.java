package chapter11.problem;

/**
 * 問題11-4
 * 以下は二次元座標の点を表すプログラムであるが、コンパイルするとエラーになった。
 * エラーが起きないように、正しく修正せよ。
 *
   public class Point {
       int x;
       int y;
       static void setPosition(int x, int y) {
           this.x = x;
           this.y = y;
       }
   }
 *
 * @author shunji.yamaguchi
 *
 */

public class Point {
    int x;
    int y;
    void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /* テスト
    public static void main(String[] args) {
        Point point = new Point();
        point.setPosition(5, 10);
        System.out.println(point.x + " " + point.y);
    }
    //*/
}
