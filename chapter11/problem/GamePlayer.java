package chapter11.problem;

/**
 * 問題11-5
 * ゲームのプレイヤーを表すクラスGamePlayerを以下のように作成した。
 * これを実行すると3人ともそれぞれの名前が出てきて欲しかったが、
 * 3人とも[player:Alice]と表示された。
 * 3人とも正しい名前が表示されるように修正せよ。
 *
   public class GamePlayer {
       public static String playername;
       public GamePlayer(String name) {
           playername = name;
       }
       @Override
       public String toString() {
           return "[player:" + playername + "]";
       }
       public static void main(String[] args) {
           GamePlayer[] player = new GamePlayer[3];
           player[0] = new GamePlayer("Mad Hatter");
           player[1] = new GamePlayer("March Hare");
           player[2] = new GamePlayer("Alice");
           for (int i = 0; i < player.length; i++) {
               System.out.println(player[i]);
           }
       }
   }
 *
 * @author shunji.yamaguchi
 *
 */
public class GamePlayer {
    public String playername;

    public GamePlayer(String name) {
        playername = name;
    }

    @Override
    public String toString() {
        return "[player:" + playername + "]";
    }

    public static void main(String[] args) {
        GamePlayer[] player = new GamePlayer[3];
        player[0] = new GamePlayer("Mad Hatter");
        player[1] = new GamePlayer("March Hare");
        player[2] = new GamePlayer("Alice");
        for (int i = 0; i < player.length; i++) {
            System.out.println(player[i]);
        }
    }
}
