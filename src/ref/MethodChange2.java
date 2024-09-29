package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value); // dataA.value = 10
        changeReference(dataA);
        System.out.println("메서드 호출 후: dataA.value = " + dataA.value); // dataA.value = 20
    }

    // 메서드로 참조(메모리) 값을 전달하면 참조값이 복사되어 결국 호출자의 객체(dataA)도 변경된다.
    static void changeReference(Data dataX){
        dataX.value = 20;
    }
}
