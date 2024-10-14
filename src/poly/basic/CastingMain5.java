package poly.basic;

// Instanceof 를 사용해 원하는 타입으로 변경 가능한지 확인
// A instanceof B : B 타입이 A 타입에 들어갈 수 있는지 대입해보면 됨
public class CastingMain5 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent){
        parent.parentMethod();
        // Child 인스턴스 경우 childMethod() 실행
        if (parent instanceof Child) { // parent 가 Child 인스턴스인지?
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent;
            child.childMethod();
        }
    }
}
