package ch06.car.example;

import ch06.car.Car;

public class SportsCar extends Car {
    // 디폴트 함수는 접근 X
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        System.out.println(sportsCar.company);
        // 다른 패키지여도 상속받은 클래스이면 접근 가능
    }
}
