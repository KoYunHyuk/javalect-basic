package poly.ex5;

// ** 인터페이스 사용 이유 **
// 1. 제약 - 메서드를 반드시 구현해야 한다는 규약
// 2. 다중 구현 - 인터페이스는 부모를 여러명 두는 다중 구현(다중 상속)이 가능
public interface InterfaceAnimal {
    void sound(); // public abstract 생략
    void move(); // public abstract 생략
}
