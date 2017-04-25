package chapter10.problem;

/**
 * 問題10-3
 * 名前（name）と価格（price）を持つ「製品」と表すクラスを作ろうと思い、
 * 以下のProductItemクラスを宣言した。間違っているところを直せ。
 *
   public class ProductItem {
       char name // 名前
       int price // 価格
       @Override
       public String toString(){
           return [ + name + , + price + ];
       }
   }
 *
 * @author shunji.yamaguchi
 *
 */
public class ProductItem {
    String name; // 名前
    int price; // 価格

    public ProductItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[ " + name + ", " + price + " ]";
    }

    /* テスト用
    public static void main(String[] args) {
        ProductItem watch = new ProductItem("腕時計", 1000);
        System.out.println(watch);
    }
    //*/
}
