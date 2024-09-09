package ch07.Employee;

public class EmployeeExample {
    public static void main(String[] args) {
        // 객체 생성
        FullTimeEmployee alice = new FullTimeEmployee("Alice", 30000);
        PartTimeEmployee bob = new PartTimeEmployee("Bob", 2000, 4);

        // 출력 (객체 내부 요소들 호출)
        System.out.println(alice.name + "'s Salary: " + alice.calculateSalary());
        System.out.println(bob.name+"'s Salary: "+bob.calculateSalary());
    }
}
