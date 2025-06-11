class CarInfo {
    String brand;
    int year;
    String Model;
    String Nickname = "";

    public  CarInfo(String brand, int year, String Model) {
        this.brand = brand;
        this.year = year;
        this.Model = Model;
    }

    public  CarInfo(String brand, int year, String Model, String Nickname) {
        this.brand = brand;
        this.year = year;
        this.Model = Model;
        this.Nickname = Nickname;
    }

    public String displayinfo() {
        String displayNickname = this.Nickname.equals("") ? "" : this.Nickname;

        return (
                "차의 브랜드는 " + brand + ", 연식은 " + year + ", 모델명은 " + Model + "입니다. "  + displayNickname
        );
    }
}

public class Scanner2 {
    public static void main(String[] args) {
        CarInfo c1 = new CarInfo("Hyundai",15, "sonata");
        CarInfo c2 = new CarInfo("Mercedes-Benz", 23, "E320d", "붕붕이");

        System.out.println(c1.displayinfo());
        System.out.println(c2.displayinfo());
    }

}

