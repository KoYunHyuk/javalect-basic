package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "Hello java";
        // static 이 붙은 정적 메서드는 별도의 객체 생성 없이도 사용이 가능하다.
        String deco = DecoUtil2.deco(s);

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
