package chapter08.problem;

/**
 * 問題8-5
 * メソッドgetYourNameを呼び出して、"結城"と"浩"の2つの文字列を得たいと考えた。
 * しかしreturnには1つの式しか書けないため、2つのStringを戻り値にはできない。
 * そこで引数に代入して返そうと考えた。どうすれば2つの文字列を返すことができるか。
 * 以下のプログラムを参考に作成せよ。

   "結城"と"浩"の2つの文字を返すメソッド（?）
   public static void getYourName(String myoji, String name) {
       myoji = "結城";
       name = "浩";
   }

   public static void main(String[] args) {
       String x;
       String y;
       getYourName(x, y);
       System.out.println("名字は" + x);
       System.out.println("名前は" + y);
   }
 *
 * @author shunji.yamaguchi
 *
 */
public class Problem8_5 {
    /* "結城"と"浩"の2つの文字を返すメソッド */
    public static String[] getYourName() {
        String[] name = {"結城", "浩"};
        return name;
    }

    public static void main(String[] args) {
        String[] name = getYourName();
        System.out.println("名字は" + name[0]);
        System.out.println("名前は" + name[1]);
    }
}
