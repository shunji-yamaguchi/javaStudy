package chapter10.problem;

/**
 * 問題10-5
   public class Student {
       String name; // 氏名
       int[] tens; // 試験の点数
       public Student(String name, int x, int y, int z) {
           ???
       }
        @Override
        public String toString() {
            String s = "[" + name;
            for (int i = 0; ???; i++) {
                s += ???;
            }
            s += "]";
            return s;
        }
        public int total() {
            int sum = 0;
            for (int i = 0; ???; i++) {
                ???
            }
            return sum;
        }
   }
 *
 * 3教科の試験の合計点を学生ごとに表示したい。StudentTest.javaを実行した際に、
 * 以下のような結果になるよう、以上のプログラムの???部分を完成させよ。
 *
   [結城浩,65,90,100]      -> 255
   [阿部和馬,82,73,64]     -> 219
   [伊藤光一,74,31,42]     -> 147
   [佐藤太郎,100,95,99]    -> 294
 *
 * @author shunji.yamaguchi
 *
 */
public class Student {
    String name; // 氏名
    int[] tens; // 試験の点数

    public Student(String name, int x, int y, int z) {
        this.name = name;
        this.tens = new int[3];
        this.tens[0] = x;
        this.tens[1] = y;
        this.tens[2] = z;
    }

    @Override
    public String toString() {
        String s = "[" + name;
        for (int i = 0; i < tens.length; i++) {
            s += "," + tens[i];
        }
        s += "]";
        return s;
    }

    public int total() {
        int sum = 0;
        for (int i = 0; i < tens.length; i++) {
            sum += tens[i];
        }
        return sum;
    }
}
