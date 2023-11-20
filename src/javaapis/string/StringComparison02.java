package javaapis.string;

//Lesson 6Chapter 4.3 文字列の比較：equals()メソッド
//equals()メソッドを使うと、アドレスを比較するのではなく、実際の値を比較してくれる。

public class StringComparison02 {
    public static void main(String[] args) {
        // Stringオブジェクトを新規作成し、str1に代入
        String str1 = new String("abc");
        // Stringオブジェクトを新規作成し、str2に代入
        String str2 = new String("abc");

        // str1とstr2の比較
        if (str1.equals(str2)) {
            System.out.println("一致しました");
        } else {
            System.out.println("しませんでした！");
        }
    }

}