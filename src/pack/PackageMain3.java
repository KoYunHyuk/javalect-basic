package pack;

import pack.a.User;

// 다른 패키지 동일 이름 클래스가 있을 경우 빈도가 높은 패키지만 Import 해서 사용
public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User();
    }
}
