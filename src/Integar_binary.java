public class Integar_binary {
    public static void main(String[] args) {
        int number = 25256;

        String binaryString = Integer.toBinaryString(number);
        String hexString = Integer.toHexString(number);
        System.out.println("Binary: " + binaryString);
        System.out.println("Hex: " + hexString);

    }
}
