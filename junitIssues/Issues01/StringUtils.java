package junitIssues.Issues01;

import java.util.ArrayList;
import java.util.List;

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
        List<Integer> offsets = new ArrayList<Integer>();
        int count = 0;
        for (int i = 1; i < camel.length(); i++) {
            if (Character.isUpperCase(camel.charAt(i))) {
                offsets.add(i + count);
                count++;
            }
        }

        StringBuilder sb = new StringBuilder(camel.toLowerCase());
        for (int offset : offsets) {
            sb.insert(offset, "_");
        }

        return sb.toString();
    }
}
