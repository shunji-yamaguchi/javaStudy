package chapter11.problem;

/**
 * 問題11-8
 * 以下のプログラムではwidthやheightの値がマイナスであるかどうかのチェックがない。
 * そこでwidthとheightがマイナスになるなら、強制的に0にするよう修正せよ。
 *
   public class Rectangle2 {
       int width;
       int height;
       Rectangle2() {
           setSize(10, 20);
       }
       Rectangle2(int w, int h) {
           setSize(w, h);
       }
       void setSize(int w, int h) {
           width = w;
           height = h;
       }
       int getArea() {
           return width * height;
       }
       public static void main(String[] args) {
           Rectangle2 r1 = new Rectangle2();
           System.out.println("r1.width = " + r1.width);
           System.out.println("r1.height = " + r1.height);
           System.out.println("r1.getArea() = " + r1.getArea());
           Rectangle2 r2 = new Rectangle2(123, 45);
           System.out.println("r2.width = " + r2.width);
           System.out.println("r2.height = " + r2.height);
           System.out.println("r2.getArea() = " + r2.getArea());
       }
   }
 *
 * @author shunji.yamaguchi
 *
 */
public class Rectangle2 {
    int width;
    int height;

    Rectangle2() {
        setSize(10, 20);
    }
    Rectangle2(int w, int h) {
        setSize(w, h);
    }

    void setSize(int w, int h) {
        if (w < 0) {
            w = 0;
        }
        if (h < 0) {
            h = 0;
        }

        width = w;
        height = h;
    }

    int getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle2 r1 = new Rectangle2();
        System.out.println("r1.width = " + r1.width);
        System.out.println("r1.height = " + r1.height);
        System.out.println("r1.getArea() = " + r1.getArea());
        Rectangle2 r2 = new Rectangle2(123, 45);
        System.out.println("r2.width = " + r2.width);
        System.out.println("r2.height = " + r2.height);
        System.out.println("r2.getArea() = " + r2.getArea());

        /* テスト
        Rectangle2 r3 = new Rectangle2(-1, -10000);
        System.out.println("r3.width = " + r3.width);
        System.out.println("r3.height = " + r3.height);
        System.out.println("r3.getArea() = " + r3.getArea());
        //*/
    }
}
