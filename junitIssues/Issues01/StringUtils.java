package junitIssues.issues01;

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
        StringBuilder snake = new StringBuilder(camel.length() + 16); // camel.length() + 16：camelを引数に生成した場合のcapacity

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
