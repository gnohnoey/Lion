class Con_Car {
    String brand;
    int year;

    public Con_Car(String brand, int year){
        this.brand = brand;
        this.year = year;

    }

    public void displayInfo(){
        System.out.println("차량 브랜드: " + brand + ", 연식: " + year);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Con_Car car = new Con_Car("현대", 2020);
        car.displayInfo();
    }
}
