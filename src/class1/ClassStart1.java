package class1;

public class ClassStart1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "A";
        student1.age = 10;
        student1.grade = 50;

        Student student2 = new Student();
        student2.name = "A";
        student2.age = 20;
        student2.grade = 90;

        Student[] students = new Student[2]; // x005

        // 자바에서 대입은 항상 변수에 있는 값을 복사한다.
        // 변수에는 인스턴스에 접근할 수 있는 참조 값을 가지고 있는 것 뿐이다.
        students[0] = student1; // x001
        students[1] = student2; // x002




        System.out.println("이름 : " + students[0].name + " 나이 : " + students[0].grade + " 성적 : "+ students[0].age);
        System.out.println("이름 : " + students[1].name + " 나이 : " + students[1].grade + " 성적 : "+ students[1].age);
    }

}
