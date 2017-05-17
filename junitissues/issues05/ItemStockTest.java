package junitissues.issues05;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 * 【void型を戻り値とするメソッドのテスト】
 * 商品を表すItemクラスが定義されているとき、商品を追加／削除／数量の変更などができる
 * ItemStockクラスを作成したい。商品を追加するaddメソッドのテストを作成せよ。
 * なお、商品は商品名（name）で一意に識別できるとする。
 *
 * @author shunji.yamaguchi
 *
 */
@RunWith(Enclosed.class)
public class ItemStockTest {
    public static class 初期状態からはじめるテスト {
        private ItemStock itemStock;

        @Before
        public void インスタンスを生成する() {
            itemStock = new ItemStock();
        }

        @Test
        public void getNumで0を取得すること() {
            assertThat(itemStock.getNum(new Item("item1",  100)), is(0));
        }

        @Test
        public void addでItemを追加するとgetNumで1を取得すること() {
            itemStock.add(new Item("item1",  100));
            assertThat(itemStock.getNum(new Item("item1",  100)), is(1));
        }
    }

    public static class Itemが1つ追加されている状態ではじめるテスト {
        private ItemStock itemStock;

        @Before
        public void インスタンスを生成しItemを1つ追加する() {
            itemStock = new ItemStock();
            itemStock.add(new Item("item1", 100));
        }

        @Test
        public void getNumで1を取得すること() {
            assertThat(itemStock.getNum(new Item("item1",  100)), is(1));
        }

        @Test
        public void addで同じItemオブジェクトを追加するとgetNumで2を取得すること() {
            itemStock.add(new Item("item1", 100));
            assertThat(itemStock.getNum(new Item("item1",  100)), is(2));
        }

        @Test
        public void addで異なるItemオブジェクトを追加するとそれぞれのItemについてgetNumで1を取得すること() {
            itemStock.add(new Item("item2", 200));
            assertThat(itemStock.getNum(new Item("item1",  100)), is(1));
            assertThat(itemStock.getNum(new Item("item2",  200)), is(1));
        }
    }
}
