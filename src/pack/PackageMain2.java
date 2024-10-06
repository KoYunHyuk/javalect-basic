package pack;

import pack.a.User; // import 사용해 다른 package 내 클래스를 가져다 쓸 수 있음
import pack.a.*; // pack.a 내의 모든 클래스를 가져다 쓸 수 있음. 와일드카드

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User();
    }
}
