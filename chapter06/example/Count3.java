package chapter06.example;

public class Count3 {
    public static void main(String[] arg) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + "の2乗は" + (i * i) + "で、");
            System.out.println("3乗は" + (i * i * i) + "です。");
        }
        System.out.println("end");
    }
}
