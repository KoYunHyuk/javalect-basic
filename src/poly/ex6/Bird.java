package poly.ex6;

// 상속과 구현을 동시에 하는 경우에는 extends 먼저 사용
public class Bird extends AbstractAnimal implements Fly{

    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("새 날다");
    }
}
