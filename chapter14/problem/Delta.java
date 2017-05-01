package chapter14.problem;

/**
 * 問題14-2
 * クラスAlphaをスーパークラスに持ち、インタフェースBetaとGammaを実装した
 * Deltaクラスを宣言せよ。クラスの中身は省略してよい。
 *
 * @author shunji.yamaguchi
 *
 */
public class Delta extends Alpha implements Beta, Gamma {
}

// エラー回避用
class Alpha {
}

interface Beta {
}

interface Gamma {
}
