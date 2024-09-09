package ch07.Abstract;

public class EmployeeExample {
    public static void main(String[] args) {
        // 객체 생성
        FullTimeEmployee alice = new FullTimeEmployee("Alice", 30000);
        PartTimeEmployee bob = new PartTimeEmployee("Bob", 2000, 4);

        // 출력 (객체 내부 요소들 호출)
        System.out.println(alice.name + "'s Salary: " + alice.calculateSalary());
        System.out.println(bob.name+"'s Salary: "+bob.calculateSalary());

        // Employee employee = new Employee(); // 추상클래스로 객체 생성 불가

        // 객체 지향 특징 - 다형성
        Employee fullTimeEmployee = new FullTimeEmployee("", 45);
        Employee partTimeEmployee = new PartTimeEmployee("Bob", 2000, 4);
    }

//    void test(Employee employee) {
//        employee.calculateSalary();
//    }
//
//    void test(PartTimeEmployee emp) {
//
//    }
//
//    void test(PartTimeEmployee emp) {
//
//    }
}
