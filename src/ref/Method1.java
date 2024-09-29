package ref;

public class Method1 {
    public static void main(String[] args) { // psvm
        Student student1 = new Student();
        initStudent(student1, "A", 10, 50);

        Student student2 = new Student();
        initStudent(student2, "B", 20, 90);

        printStudent(student1);
        printStudent(student2);
    }

    // student 의 참조 값이 전달되어 호출자의 name, age, grade 실제 값이 변경됨
    static void initStudent(Student student, String name, int age, int grade){
        student.name = name;
        student.age = age;
        student.grade = grade;
    }
    // student 저장된 변수 출력
    static void printStudent(Student student){
        System.out.println("이름 : " + student.name + " 나이 : " + student.grade + " 성적 : "+ student.age);
    }
}
