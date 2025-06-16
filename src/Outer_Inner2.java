class Car{
    String brand;

    public Car(String brand){
        this.brand = brand;
    }

    class Engine{
        public void start(){
            System.out.println("The engine of " + brand + "is starting");
        }
    }

    public void startEngine(){
        Engine engine = new Engine(); //2. 엔진 인스턴스를 이 메서드에서 생성하는 게 아니라 Car의 생성자에서 생성하면 재활용 가능
        engine.start();
    }
}

public class Outer_Inner2 {
    public static void main(String[] args) {
        Car car = new Car("빠른 자동차");
        car.startEngine(); //1. 이 메서드로 생성된 인스턴스는 한번 쓰고 버려지는 코드가 되기 때문에
    }
}
