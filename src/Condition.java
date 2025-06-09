public class Condition {
    public static void main(String[] args) {
        int num = -1;
        String mood = "happy";
        String day = "MONDAY";
        /*
        if(num>0){
            System.out.println("num은 양수입니다");
        } else if(num<0){
            System.out.println("num은 음수입니다");
        } else {
            System.out.println("num은 0입니다");
        }

        switch (mood){
            case "happy":
                System.out.println("행복");
                break;
            case "sad":
                System.out.println("슬픔");
                break;
            case "gloomy":
                System.out.println("우울");
                break;
            default:
                System.out.println("모르겠다");
        }

        switch (day) {
            case "MONDAY":
            case "TUESDAY":
            case "WEDNESDAY":
            case "THURSDAY":
            case "FRIDAY":
                System.out.println("Weekday");
                break;
            case "SATURDAY":
            case "SUNDAY":
                System.out.println("Weekend");
                break;
        }

        if(mood=="happy"){
            System.out.println("행복");
        } else if (mood=="sad") {
            System.out.println("슬픔");
        } else if (mood=="gloomy") {
            System.out.println("우울");
        } else{
            System.out.println("모르겠다");
        }
        */
        int age = 20;
        boolean hasID = true;
        if(age>=18 && hasID){
            System.out.println("접속 가능");
        }

        boolean isWeekend = false;
        boolean isHoliday = true;
        if(isWeekend || isHoliday){
            System.out.println("쉴 수 있습니다");
        }

        boolean isRaining = true;
        if(!isRaining){
            System.out.println("나갈 수 있음");
        } else {
            System.out.println("우산 챙겨야 함");
        }
    }
}
