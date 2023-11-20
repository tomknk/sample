package javaapis.string;
//Lesson 6Chapter 4.4
//部分文字列の取得：substring()メソッド
//3つ目は含まずその前で切り取るというルール
public class SubstringSample {

    public static void main(String[] args) {
        String str = "あいうえお";
        String sub = str.substring(1, 3);
        System.out.println(sub);
    }

}