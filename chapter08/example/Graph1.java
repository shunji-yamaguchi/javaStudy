package chapter08.example;

public class Graph1 {
    public static void main(String[] args) {
        printGraph(81);
    }

    public static void printGraph(int x) {
        for (int i = 0; i < x; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
