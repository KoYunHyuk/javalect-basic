package final1;

public class ConstantMain1 {
    public static void main(String[] args) {
        // 1000 이라는 값이 무슨 값이지?? - 의문을 가지게 됨(Magic Number)
        System.out.println("프로그램 최대 참여자 수 " + 1000);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process(int currentUserCount){
        System.out.println("참여자 수:" + currentUserCount);
        if(currentUserCount > 1000){
            System.out.println("대기자를 등록합니다.");
        } else {
            System.out.println("게임에 참여합니다.");
        }
    }
}