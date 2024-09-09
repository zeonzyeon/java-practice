package ch07.computer;

public class ComputerExample {
    public static void main(String[] args) {
        Computer computer = new Computer();
        System.out.println("computer.areaCircle: " + computer.areaCircle(4));

        Calculator calculator = new Calculator();
        System.out.println("calculator.areaCircle: " + calculator.areaCircle(4));
    }
}
