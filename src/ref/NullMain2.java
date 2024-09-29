package ref;

public class NullMain2 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bitData.count=" + bigData.count); // 0
        System.out.println("bitData.data="+bigData.data); // null

        // NullPointerException - Null에 점을 찍으려 해서 생기는 오류
        System.out.println("bigData.data.value" + bigData.data.value);
    }
}
