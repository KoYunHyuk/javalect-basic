package poly.ex3;

// 추상 메서드가 단 하나라도 존재하면 해당 클래스도 추상 클래스로 선언해야 한다
public abstract class AbstractAnimal {

    // 해당 메서드는 자식 클래스가 반드시 오버라이딩하여 사용
    public abstract void sound();

    // 자식 클래스가 오버라이딩 하지 않아도 됨
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
