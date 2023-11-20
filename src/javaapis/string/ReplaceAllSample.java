package javaapis.string;
//Lesson 6Chapter 4.5
//文字列の置換：replaceAll()メソッド
//指定された正規表現に一致する、この文字列の各部分文字列に対し、指定された置換を実行します。

public class ReplaceAllSample {

    public static void main(String[] args) {
        String str = "100ドル";
        String sub = str.replaceAll("ドル", "円");
        System.out.println(sub);
    }

}
