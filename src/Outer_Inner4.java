class Outer{
    String outerMessage = "Hello from Outer";

    private class Inner {
        void showMessage() {
            System.out.println(outerMessage);
        }
    }
}

public class Outer_Inner4 {
    public static void main(String[] args) {
        Outer_Inner4 main = new Outer_Inner4();

        //Outer_Inner4.Inner inner = main.new Inner(); //컴파일 오류 --> Inner 클래스가 private이므로 외부에서 접근할 수 없음

        //inner.showMessage();
    }
}
