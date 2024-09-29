package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a); // a = 10
        changePrimitive(a);
        System.out.println("메서드 호출 후: a = " + a); // a = 10
    }

    // 메서드로 기본형 데이터를 전달하면, 해당값이 복사되어 호출자의 변수 값(a)은 영향이 없다.
    static void changePrimitive(int x){
        x = 20;
    }
}
