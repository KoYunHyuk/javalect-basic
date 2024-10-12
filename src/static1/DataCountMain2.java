package static1;

public class DataCountMain2 {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // data1 객체를 통해서 Counter 인스턴스에 접근해 Count++
        Data2 data1 = new Data2("A", counter);
        System.out.println("A count=" + counter.count);

        // data2 객체를 통해서 Counter 인스턴스에 접근해 Count++
        Data2 data2 = new Data2("B", counter);
        System.out.println("B count=" + counter.count);

        // data3 객체를 통해서 Counter 인스턴스에 접근해 Count++
        Data2 data3 = new Data2("C", counter);
        System.out.println("C count=" + counter.count);
    }
}
