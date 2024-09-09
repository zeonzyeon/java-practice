package ch07.Employee;

public class FullTimeEmployee extends Employee {
    double salary;

    FullTimeEmployee(String name, double salary) {  // 생성자
        super(name);
        this.salary = salary;
    }

    @Override
    double calculateSalary() {  // 메소드 재정의 (Override)
        return salary;
    }
}
