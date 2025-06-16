class Vehicle{
    String brand;
    public Vehicle(String brand){
        this.brand = brand;
    }
    public void display(){
        System.out.println("브랜드: " + brand);
    }
}

class Cars extends Vehicle{
    String model;
    public Cars(String brand, String model){
        super(brand);
        this.model = model;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("모델명: " + model);
    }
}

public class extend2 {
    public static void main(String[] args) {
        Cars car1 = new Cars("현대", "제네시스GV80");
        car1.display();
    }
}
