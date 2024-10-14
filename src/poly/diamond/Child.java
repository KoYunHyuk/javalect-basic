package poly.diamond;

// Interface 의 경우엔 다중 구현(다중 상속)이 가능
// A를 통해서 메서드에 접근하던, B를 통해서 메서드에 접근하던 결국 오버라이딩 된 메서드는 하나이기 때문
public class Child implements InterfaceA, InterfaceB{

    @Override
    public void methodA() {
        System.out.println("Child.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("Child.methodB");
    }

    @Override
    public void methodCommon() {
        System.out.println("Child.methodCommon");
    }
}
