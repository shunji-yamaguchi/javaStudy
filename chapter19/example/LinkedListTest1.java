package chapter19.example;

import java.util.LinkedList;

public class LinkedListTest1 {
    public static void main(String[] args) {
        // LinkdeListのインスタンス確保
        LinkedList<String> list = new LinkedList<String>();

        // 要素を追加（addメソッド）
        list.add("Bob");
        list.add("Chris");
        list.add("Diana");
        list.add("Elmo");

        // 現在の状態
        System.out.println(list);

        // 先頭にAliceを挿入
        list.addFirst("Alice");

        // Aliceを挿入した後の状態
        System.out.println(list);
    }
}
