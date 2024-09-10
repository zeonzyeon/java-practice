package ch08.zoo2;

public class Zookeeper {
    public void feed(Predator predator) { // 하나의 메소드로 통일
        // System.out.println("feed meat");
        System.out.println("feed "+predator.getFood());
    }
}
