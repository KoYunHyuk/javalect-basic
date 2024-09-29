package ref;

import java.util.Scanner;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();
        System.out.println("bitData.count=" + bigData.count); // 0
        System.out.println("bitData.data="+bigData.data); // ref.Data@27bc2616

        System.out.println("bigData.data.value" + bigData.data.value); // 0
    }
}
