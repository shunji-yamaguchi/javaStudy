package chapter06.example;

public class Count3 {
    public static void main(String[] arg) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + "の2乗は" + (int)Math.pow(i, 2) + "で、");
            System.out.println("3乗は" + (int)Math.pow(i, 3) + "です。");
        }
        System.out.println("end");
    }
}
