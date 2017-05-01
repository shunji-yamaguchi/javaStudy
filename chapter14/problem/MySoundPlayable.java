package chapter14.problem;

/**
 * 問題14-4
 * MyMediaPlayableインタフェースを拡張してMySoundPlayableという名前の
 * サブインタフェースを宣言せよ。追加するメソッドは以下とする。
 *   String getSoundName();
 *
 * @author shunji.yamaguchi
 *
 */
public interface MySoundPlayable extends MyMediaPlayable {
    String getSoundName();
}
