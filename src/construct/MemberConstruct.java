package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // [생성자]
    // 반환 타입이 없고 클래스와 이름이 동일해야 함
    // 기본 생성자는 ()안에 아무 변수 없는 생성자를 의미하고,
    // 만약 아래처럼 MemberConstruct 생성자를 선언했을 경우, 자바는 기본 생성자를 만들지 않는다.
    // 장점: 직접 정의한 생성자를 !!반드시!! 호출해야 되고 호출하지 않을 시 컴파일 에러
    //      유령 객체를 생성할 가능성을 원천 차단한다.
    MemberConstruct(String name, int age){
        // this() 생성자 코드는 항상 첫 줄에 작성해야 함!!
        this(name, age, 50);
    }

    MemberConstruct(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
        System.out.println("생성자 호출 : name = " + name + ", age = " + age + ", grade = "+grade);
    }
}
