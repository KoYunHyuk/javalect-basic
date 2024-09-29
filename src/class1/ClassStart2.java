package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "A";
        student1.age = 10;
        student1.grade = 50;

        Student student2 = new Student();
        student2.name = "A";
        student2.age = 20;
        student2.grade = 90;

        // 자바에서 대입은 항상 변수에 있는 값을 복사한다.
        // 변수에는 인스턴스에 접근할 수 있는 참조 값을 가지고 있는 것 뿐이다.
        Student[] students = {student1, student2}; // x005
        // Student[] students = new Student[]{student1, student2};

        // for문 (1) = for문 (2)
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println("이름 : " + s.name + " 나이 : " + s.grade + " 성적 : " + s.age);
        }
        // for문 (2) = for문 (1)
        for (Student s : students) {
            System.out.println("이름 : " + s.name + " 나이 : " + s.grade + " 성적 : " + s.age);
        }
    }
}
