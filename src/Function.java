public class Function {
    public static void printStudent(String name, int age){
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("------------");
    }
    public static void main(String[] args) {
        printStudent("Alice", 20);
        printStudent("Bob", 22);
        printStudent("Charlie", 25);
    }
}
