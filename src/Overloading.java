public class Overloading {

    public static int add(int a, int b){
        return a + b;
    }
    public static int add(int a, int b, int c){
        return a+b+c;
    }

    public static void greet(){
        System.out.println("Hello, World!");
    }

    public static void greet(String name){
        System.out.println("Hello, " + name + "!");
    }


    public static void main(String[] args) {
        greet();
        greet("Alice");

        //System.out.println(); 이것도 오버로딩된 함수
    }
}
