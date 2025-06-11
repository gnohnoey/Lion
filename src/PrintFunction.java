public class PrintFunction {
    public static void main(String[] args) {
        /*
        String name = "Alice";
        int age = 28;
        double height = 164.52;
        int backNumber = 7;

        Integer num = 10; //Integer라고 치면 int를 활용한 메서드 사용 가능


        System.out.printf("Name: %s, Age: %d, Height: %.1f\n", name, age, height);
        System.out.println((name + backNumber).getClass().getName());
        System.out.println(((Object) backNumber).getClass().getName());

        System.out.println("\"안녕\"\t하세요\n 훔냐리\\");
         */

        double pi = Math.PI;
        System.out.println(pi); //자바의 double형 타입은 소수 14자리 까지 오차없이 표현할 수 있음. 64비트가 처리할 수 있는 정도
        //자바는 0.5, 0.25, 0.125 ... 이런 식으로 최대한 소수 근사치를 표현함
        System.out.printf("%.20f",pi);

    }
}
