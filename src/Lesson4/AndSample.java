package Lesson4;

public class AndSample {

    public static void main(String[] args) {
        //IfElseIfSampleを　論理演算子&&（AND)で記載した場合の例

        int score = 59; // 成績

        if (score == 100) {
            System.out.println("満点です！ご褒美をあげます！");
        } else if (score >= 80 && score <= 99) {
            System.out.println("よくできました！");
        } else if (score >= 60 && score <= 79) {
            System.out.println("合格です！");
        } else {
            System.out.println("赤点です...補講を行ないます");
        }
    }

}