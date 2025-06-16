class Animal{
    String name;
    public Animal(String name){
        this.name = name;
    }

    public void printName(){
        System.out.println("이름: " + name); //this 키워드 빼도 상관 없음 매개변수가 없으니까 자동으로 this.name으로 해석
    }
}

class Dog extends Animal{
    String breed;

    public Dog(String name, String breed){
        super(name);
        this.breed = breed;

    }

    @Override
    public void printName(){
        System.out.println("이름: " + name + ", 견종: " + breed);
    }
}

public class extend1 {
    public static void main(String[] args) {
        Dog dog = new Dog("솜이", "포메라니안");

        dog.printName();
        }

}
