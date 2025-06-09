public class Array {
    public static void main(String[] args) {
        /*
        int[] nums = {2,4,6,8,10};
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
        }
        System.out.println(sum);
        */

        String message = "Hello, Java!";
        for(int i = 0; i < message.length(); i++){
            System.out.println(message.charAt(i)); //한글자씩 출력
            if(message.charAt(i) == 'l'){
                System.out.println(message.charAt(i));
            }
        }

        String address = "0x120819f5573ac3A530e6172b1581613A09b4b338";

        System.out.println(address.substring(0, 7)
                + "..."
                + address.substring(address.length() - 5));
    }
}
