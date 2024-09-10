package ch08.vehicle;

public class Taxi implements Vehicle{ // Vehicle 인터페이스를 구현하겠다.
    @Override
    public void run() {
        System.out.println("Taxi is running");
    }

}
