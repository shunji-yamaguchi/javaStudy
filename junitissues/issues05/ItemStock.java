package junitissues.issues05;

import java.util.ArrayList;
import java.util.List;

/**
 * 【void型を戻り値とするメソッドのテスト】
 * 商品を表すItemクラスが定義されているとき、商品を追加／削除／数量の変更などができる
 * ItemStockクラスを作成したい。商品を追加するaddメソッドのテストを作成せよ。
 * なお、商品は商品名（name）で一意に識別できるとする。
 *
 * @author shunji.yamaguchi
 *
 */
public class ItemStock {
    private List<Item> items;

    public ItemStock() {
        this.items = new ArrayList<Item>();
    }

    public void add(Item item) {
        items.add(item);
    }

    public int getNum(Item item) {
        int count = 0;
        for (Item i : items) {
            if (i.name.equals(item.name)) {
                count++;
            }
        }
        return count;
    }
}
