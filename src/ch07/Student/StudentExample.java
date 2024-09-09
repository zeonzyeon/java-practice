package ch07.Student;

public class StudentExample {
    public static void main(String[] args) {
        Student student = new Student("이름", "12345-6789",20215110);
        System.out.println(student.name);
        System.out.println(student.ssn);
        System.out.println(student.studentNo);
    }
}
