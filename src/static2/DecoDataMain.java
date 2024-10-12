package static2;

// Alt + Enter
// 해당 클래스 내 정적 메서드들을 호출 가능
import static static2.DecoData.*;

public class DecoDataMain {
    public static void main(String[] args) {
        // 정적 호출 시 인스턴스가 생성되지 않기 때문에 객체 참조 값이 없음
        System.out.println("1. 정적 호출");
        staticCall();

        System.out.println("2. 인스턴스 호출 1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출 2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        // 정적 메서드여도 참조 값을 넘겨주면 인스턴스 변수 호출이 가능하다
        staticCall(data1);
    }
}
