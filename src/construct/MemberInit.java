package construct;

public class MemberInit {
    // 멤버 변수
    String name;
    int age;
    int grade;

    // this는 인스터스 자신(MemberInit)의 참조 값이다. X001
    // 지역변수와 멤버 변수가 다를 경우는 this를 생략하지만 생략하지 않고 그대로 써도 됨
    // 변수 구분을 위해 사용하기도 하지만 요즘엔 IDE(통합개발환경)가 변수를 색으로 구분해주기 때문에 안쓰는 추세
    void initMember(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
