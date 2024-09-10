package ch08.drive;

public class Driver {
    void drive(Vehicle vehicle) {
        if(vehicle instanceof Bus){
            System.out.println("Bus//");
        }else if(vehicle instanceof Taxi){
            System.out.println("Taxi//");
        }
        vehicle.run();

        // if 조건문 대신 switch-case문으로 작성
        // Pattern matching for Switch (JDK 17부터 사용 가능)
        switch (vehicle){
            case Bus bus -> System.out.println("Bus//");
            case Taxi taxi -> System.out.println("Taxi//");
            default -> System.out.println("Unknown vehicle");
        }
        vehicle.run();
    }
}
