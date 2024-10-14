package poly.ex4;

// 순수 추상 클래스 - 내부 모든 메서드들이 추상 메서드인 경우
// 다형성을 위한 부모로서의 껍데기 역할
// 자식 클래스는 부모의 모든 메서드를 오버라이딩 해야 한다.
// ** 인터페이스 역할을 하는 클래스 **
public abstract class AbstractAnimal {

    public abstract void sound();
    public abstract void move();
}
