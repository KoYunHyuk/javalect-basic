package construct;

public class MethodInitMain1 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.initMember("user1", 15, 90);

        MemberInit member2 = new MemberInit();
        member2.initMember("user2", 16, 80);

        System.out.println(member1.name + " " + member1.age + " " +member1.grade);
        System.out.println(member2.name + " " + member2.age + " " +member2.grade);

    }



}
