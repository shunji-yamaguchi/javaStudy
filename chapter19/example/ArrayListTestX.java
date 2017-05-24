package chapter19.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTestX {
    public static void main(String[] args) {
        // ListとしてArrayListのインスタンス確保
        List<String> list = new ArrayList<String>();

        // Alice, Bob, Chris, Diana, Elmo を追加
        list.add("Alice");
        list.add("Bob");
        list.add("Chris");
        list.add("Bob");
        list.add("Elmo");

        // 最初と最後の要素の参照（getメソッドとsizeメソッド）
        System.out.println("最初の要素 = " + list.get(0));
        System.out.println("最後の要素 = " + list.get(list.size() - 1));

        // すべての要素を参照（拡張forループ）
        for (String s : list) {
            System.out.println(s);
        }

        // Bobの添え字は？
        System.out.println("最初に出てくるBobの添え字 = " + list.indexOf("Bob"));
        System.out.println("最初に出てくるBobの添え字 = " + list.lastIndexOf("Bob"));
    }
}
