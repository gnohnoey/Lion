import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        final String COLA = "코카콜라";
        final String CIDER = "사이다";
        final String WATER = "삼다수";

        final int COLA_PRICE = 1200;
        final int CIDER_PRICE = 1500;
        final int WATER_PRICE = 800;

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 자판기 메뉴 ===");
        System.out.printf("1 %s - %d원\n", COLA, COLA_PRICE);
        System.out.printf("2 %s - %d원\n", CIDER, CIDER_PRICE);
        System.out.printf("3 %s - %d원\n", WATER, WATER_PRICE);

        String item;
        int price;

        while (true){
            String choice = scanner.nextLine();
            switch (choice){
                case COLA:
                    item = COLA;
                    price = COLA_PRICE;
                    break;
                case CIDER:
                    item = CIDER;
                    price = CIDER_PRICE;
                    break;
                case WATER:
                    item = WATER;
                    price = WATER_PRICE;
                    break;
                default:
                    System.out.println("잘못된 선택입니다");
                    continue;
            }
            break;
        }

        System.out.println(item + "를(을) 선택하셨습니다. 금액을 넣어주세요");
        int totalMoney = 0; //루프 밖에서 선언한 변수는 루프가 반복되는 동안 값을 유지. 루프 안에다 선언하면 루프가 돌 때마다 초기화되기 때문에 무효!
        while (true){
            int input = scanner.nextInt();
            totalMoney += input;
            if(totalMoney < price){
                System.out.println("금액이 부족합니다. 다시 넣어주세요");
                continue;
            } else if (totalMoney > price) {
                System.out.println("거스름돈 " + (totalMoney-price) + "원이 나옵니다");
                System.out.println("감사합니다. " + item + "를 제공합니다.");
                break;
            } else {
                System.out.println("감사합니다. " + item + "를 제공합니다.");
                break;
            }

        }

    }
}
