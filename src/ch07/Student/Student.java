package ch07.Student;

public class Student extends Person {
    int studentNo;
    // Student()
    // super() => Person() 부모 생성자 호출
    // 근데 부모에 디폴트 생성자가 없음
    Student(String name, String ssn, int studentNo){ // 이 생성자를 호출해주면 오류가 사라짐
        super(name, ssn); // 생성해주지 않으면 자동으로 디폴트 생성자를 호출함
        this.studentNo = studentNo;
    }
}
