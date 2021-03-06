package chapter03.problem;

/**
 * 問題3-1
 * 光の速度を秒速30万キロメートルとする。
 * このとき、光が1日に進む距離をJava言語で計算して求めよ。
 *
 * @author shunji.yamaguchi
 *
 */
public class Problem3_1 {
    public static void main(String[] arg) {
        long speedKms = 300000;
        long daySecond = 24 * 60 * 60;
        long way = speedKms * daySecond;
        System.out.println("光は1日に " + way + " キロメートル進む。");
    }
}
