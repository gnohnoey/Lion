class Outer_Inner3 {
    String outerMessage = "Hello from Outer";

    private class Inner{
        void showMessage(){
            System.out.println(outerMessage);
        }
    }

    public static void main(String[] args) {
        Outer_Inner3 outerInner3 = new Outer_Inner3();

        Outer_Inner3.Inner inner = outerInner3.new Inner(); //Inner 인스턴스 생성 --> new 키워드 사용

        inner.showMessage();
    }
}



