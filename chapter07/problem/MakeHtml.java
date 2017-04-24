package chapter07.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 問題7-3
 * 標準入力から1行ずつ読み取って、以下のルールに従って処理を行い
 * 標準出力に出すプログラムMakeHtmlを作成せよ。
 * ・ルール1
 * 　最初に1度だけ以下の6行を出力
 *   <!DOCTYPE html>
 *   <html>
 *   <head>
 *   <title>My Page</title>
 *   </head>
 *   <body>
 * ・ルール2
 *   標準入力が終わったら、最後に以下の2行を出力
 *   </body>
 *   </html>
 * ・ルール3
 *   入力行が"■"で始まっていたら、■を取り除いた文字列を
 *   "<h1>"と"</h1>"で挟んで改行付きで出力
 * ・ルール4
 *   入力行が"●"で始まっていたら、●を取り除いた文字列を
 *   "<h2>"と"</h2>"で挟んで改行付きで出力
 * ・ルール5
 *   入力行がルール3,4にも当てはまらないなら、
 *   入力行を"<p>"と"</p>"で挟んで改行付きで出力
 *
 * @author shunji.yamaguchi
 *
 */
public class MakeHtml {
    public static void main(String[] args) {
        System.out.println("<!DOCTYPE html>\n<html>\n<head>\n<title>My Page</title>\n</head>\n<body>");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                String tagS;
                String tagE;
                if (line.startsWith("■")) {
                    tagS = "<h1>";
                    tagE = "</h1>";
                } else if (line.startsWith("●")) {
                    tagS = "<h2>";
                    tagE = "</h2>";
                } else {
                    tagS = "<p>";
                    tagE = "</p>";
                }
                System.out.println(tagS + line + tagE);
            }

            System.out.println("</body>\n</html>");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
