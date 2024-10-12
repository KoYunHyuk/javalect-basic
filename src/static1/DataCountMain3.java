package static1;


import java.sql.SQLOutput;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        // Data3 Class 에 직접 접근 해서 count 값 호출
        System.out.println("A count=" + Data3.count);

        Data3 data2 = new Data3("B");
        // Data3 Class 에 직접 접근 해서 count 값 호출
        System.out.println("B count=" + Data3.count);

        Data3 data3 = new Data3("C");
        // Data3 Class 에 직접 접근 해서 count 값 호출
        System.out.println("C count=" + Data3.count);


        // [방법1] 인스턴스를 통한 접근 - 힙 영역을 거쳐서 스택 영역의 count 호출
        // 권장 X - count 가 정적 변수인지 인스턴스 변수인지 판단이 어려움
        Data3 data4 = new Data3("D");
        System.out.println(data4.count);

        // [방법2] 클래스를 통한 접근 - 스택영역에서 바로 count 호출
        System.out.println(Data3.count);
    }
}
