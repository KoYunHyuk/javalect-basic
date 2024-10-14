package poly.ex5;

// 인터페이스의 경우는 상속(extends) X , 구현(implements) O
public class Dog implements InterfaceAnimal{
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("개 이동");
    }
}
