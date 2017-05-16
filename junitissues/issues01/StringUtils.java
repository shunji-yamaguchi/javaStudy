package junitissues.issues01;

/**
 * 【状態を持たないメソッドのテスト】
 * 文字列をスネークケース（すべて小文字で単語区切りがアンダースコア）に
 * 変換するユーティリティメソッドのテストを作成せよ。
 *
 * @author shunji.yamaguchi
 *
 */
public class StringUtils {
    public static String toSnakeCase(String camel) {
        int requiredUnderscoreCountPrediction = 3;
        StringBuilder snake = new StringBuilder(camel.length() + requiredUnderscoreCountPrediction);

        for (int i = 0; i < camel.length(); i++) {
            char nowChar = camel.charAt(i);
            if (Character.isUpperCase(nowChar)) {
                if (i != 0) {
                    snake.append("_");
                }
                snake.append(Character.toLowerCase(nowChar));
            } else {
                snake.append(nowChar);
            }
        }

        return snake.toString();
    }
}
