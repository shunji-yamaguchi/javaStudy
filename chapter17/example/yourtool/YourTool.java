package chapter17.example.yourtool;

import chapter17.example.mytool.PublicTool;
//import chapter17.example.mytool.Tool; // publicでないクラスはアクセスできない

public class YourTool {
    public static void main(String[] args) {
        PublicTool a = new PublicTool();
        //Tool b = new Tool();
    }
}
