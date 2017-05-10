package chapter19.problem;

/**
 * 問題19-3
 * 第19章p269「ArrayListの内部はどうなっているか」を参考に、以下のようなクラス
 * MyStringArrayListを完成させよ。ただし、練習のためjava.utilパーッケージは使用しないこと。
 * ・コンストラクタ内でINITIAL__CAPACITY個の要素を持つString配列を、arフィールドに確保する。
 * ・addメソッドで要素を追加する。配列arが一杯なら、長さを2倍にした新しい配列を確保して追加する。
 * ・getメソッドで要素を参照する。添え字が範囲外なら、例外IndexOutOfBoundsExceptionをthrowする。
 * ・sizeメソッドで格納されている要素数（ar.lengthではない）を返す。
 *
   public class MyStringArrayList {
       private static final int INITIAL_CAPACITY = 4;
       private String[] ar;
       private int sz;

       public MyStringArrayList() {
       }

       public void add(String s) {
       }

       public String get(int n) {
       }

       public int size() {
       }
   }
 *
 * @author shunji.yamaguchi
 *
 */
public class MyStringArrayList {
    private static final int INITIAL_CAPACITY = 4;
    private String[] ar;
    private int sz;

    public MyStringArrayList() {
        ar = new String[INITIAL_CAPACITY];
        sz = 0;
    }

    public void add(String s) {
        if (sz >= ar.length) {
            String[] newAr = new String[ar.length * 2];
            for (int i = 0; i < ar.length; i++) {
                newAr[i] = ar[i];
            }
            ar = newAr;
        }
        ar[sz] = s;
        sz++;
    }

    public String get(int n) {
        if (n < 0 || sz - 1 < n) {
            throw new IndexOutOfBoundsException();
        }
        return ar[n];
    }

    public int size() {
        return sz;
    }
}
