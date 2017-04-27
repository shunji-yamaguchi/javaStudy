package chapter13.example;

public class NumberTest {
    public static void main(String[] args) {
        try {
            String numstr = "XXZ";
            int val = Integer.parseInt(numstr);
            System.out.println("val = " + val);
        } catch (NumberFormatException e) {
            System.out.println("例外:" + e);
        }
    }
}
