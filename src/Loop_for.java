public class Loop_for {
    public static void main(String[] args) {
        /*
        for(int i = 1; i<=5; i++){
            System.out.print(i);
        }
        for(int i = 10; i>0; i--){
            System.out.println(i);
        }

        int n = 5;
        for(int i=1; i<=19; i++){
            System.out.println(n +" x "+ i + " = " + n*i);
        }

        for(int i=9; i>0; i--){
            System.out.println(n +" x "+ i + " = " + n*i);
        }

        int n = 5;
        for(int i=1; i<=19; i++){
            if(i>=5){
                System.out.println(n +" x "+ i + " = " + n*i);
            }
        }
        *

        for(int i=20; i>0; i--){
            if(i%2==0){
                System.out.println(i);
            }
        }

        for(int i=1; i<=20; i++){
            if(i%3==0){
                System.out.println(i);
            }
        }

        for(int i=20; i>0; i--){
            if(i%4==0){
                System.out.println(i);
            }
        }


        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j ++) {
                System.out.println("i는" + i + " j는 " + j);
            }
        }

         */
        for (int i = 0; i < 5; i++) {
            if (i == 2)
                continue;
            System.out.println(i);
        }

    }
}
