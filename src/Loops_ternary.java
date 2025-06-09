public class Loops_ternary {
    public static void main(String[] args) {
        int a = 10;
        int b = 13;
        //삼항연산자
        //구조 : (조건) ? 참 : 거짓
        //int max = (a>b) ? a : b;
        //System.out.println(max);
        /*
        if(a>b){
            System.out.println(a);
        } else {
            System.out.println(b);
        }

        int max;
        if(a>b){
            max = a;
        } else {
            max = b;
        }
        System.out.println(max);


        int score = 61;
        String result = (score>60) ? "통과" : "탈락";
        System.out.println(result);

        if(score>60){
            result = "통과";
        } else {
            result = "탈락";
        }
        System.out.println(result);
        */

        String color = "빨강";
        String choiceColor = (color == "빨강") ? "빨강" : (color == "파랑") ? "파랑" : "보라";
        System.out.println(choiceColor);
    }
}
