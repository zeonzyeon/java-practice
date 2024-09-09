package ch07.Employee;

public class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, double hourlyRate, int hoursWorked) { // 생성자
        super(name);    // Employee(name) 호출
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {  // 메소드 재정의 (Override)
        return hourlyRate * hoursWorked;
    }
}
