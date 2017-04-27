package chapter14.problem;

import java.awt.Image;

/**
 * 問題14-3
 * 次のメソッドとフィールドを持つ、IconInfoというpublicなインタフェースを宣言せよ
 * ・引数はint型で仮引数の名前はiconType、戻り値はImage型で、名前がgetIconのメソッド
 * ・型はintで名前はICON_16x16、値は1のフィールド
 * ・型はintで名前はICON_32x32、値は2のフィールド
 *
 * @author shunji.yamaguchi
 *
 */
public interface IconInfo {
    public static final int ICON_16x16 = 1;
    public static final int ICON_32x32 = 2;

    public abstract Image getIcon(int iconType);
}
