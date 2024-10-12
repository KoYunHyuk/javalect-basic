package static1;

public class Data3 {
    // 지역 변수 : 메서드가 종료되면 제거되는 변수. 스택 영역. 생존주기 짧음
    // 인스턴스 변수 : static 이 붙지 않은 변수. 힙 영역. 생존주기 긺
    // 클래스 변수 : static 이 붙은 변수. 스택 영역. 생존주기 가장 긺
    //             JVM이 로딩될 때 단 하나만 만들어짐 !!
    public String name; // 인스턴스 변수
    public static int count; // 클래스 변수

    public Data3(String name) {
        this.name = name;
        count++;
    }
}


