class Person{
    static void greet(){
        System.out.println("static hello");
    }

    public void sayHello(){
        System.out.println("instance hello");
    }
}


class static1 {

    static int count = 0;
    static void printHello(){
        System.out.println("Hello!");
    }

    public static void main(String[] args) {
        Person.greet(); //static은 객체 생성 없이 바로 호출 가능, 인스턴스로 접근 X

        Person p = new Person();
        p.sayHello(); //non static은 객체 생성 이후 호출 가능
        printHello();

    }
}
