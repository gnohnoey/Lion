public class Outer_Inner {
    private String message = "Hello from outer class";
    class Inner{
        void displayMessage(){
            System.out.println("Inner says: " + message);
        }
    }

    public void callInner(){
        Inner inner = new Inner();
        inner.displayMessage();
    }

    public static void main(String[] args) {
        Outer_Inner outer = new Outer_Inner();
        outer.callInner();
        //Inner inner = new Inner(); 컴파일 오류 --> Inner 클래스는 Outer 클래스 안에 종속된 클래스라고 보면 됨
                                                // 따라서 Outer 인스턴스가가 생성되지 않으면 Inner 인스턴스도 없음
                                                // 하지만? Inner에 static이 붙으면 Outer와 별도의 독립된 객체로 인식됨
    }
}
