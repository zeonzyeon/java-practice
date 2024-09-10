package ch08.vehicle;

public class VehicleExample {
    public static void main(String[] args) {
        // Bus, Taxi 객체 생성
        Bus bus = new Bus();
        bus.run(); // 메소드 사용 가능

        Taxi taxi = new Taxi();
        taxi.run(); // 일반 클래스와 동일
    }
}
