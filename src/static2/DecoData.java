package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall(){
        // instanceValue++; // 인스턴스 변수 접근 불가, compile error
        // setInstanceMethod(); // 인스턴스 메서드 접근 불가, compile error

        staticValue++; // 정적 변수 접근 가능
        staticMethod(); // 정적 메서드 접근 가능
    }

    // 정적메서드이지만 data 객체가 인자로 전달되었기 때문에 인스턴스 변수에 접근이 가능하다.
    public static void staticCall(DecoData data){
        data.instanceValue++;
        data.setInstanceMethod();
    }

    public void instanceCall(){
        instanceValue++; // 인스턴스 변수 접근 가능
        setInstanceMethod(); // 인스턴스 메서드 접근 가능

        staticValue++; // 정적 변수 접근 가능
        staticMethod(); // 정적 메서드 접근 가능
    }


    private void setInstanceMethod(){
        System.out.println("instanceValue=" + instanceValue);
    }
    private static void staticMethod(){
        System.out.println("staticValue=" + staticValue);
    }
}
