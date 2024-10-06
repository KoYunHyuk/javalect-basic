package access.b;

import access.a.AccessData;

// public class 명과 파일명은 같아야 함
// 하나의 파일에 여러 class 선언 가능하지만 public 클래스는 단 하나 존재 가능
// class 의 접근제어자는 public 또는 default만 가능하다.
public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        // public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        // 같은 패키지 default 호출 불가
        //data.defaultField = 2;
        //data.defaultMethod();

        // private 호출 불가
        //data.privateField = 3;
        //data.privateMethod();

        data.innerAccess();
    }
}