package ch08.defaultmethod;

public class Zookeeper {
    void feed(Predator predator) { // 하나의 메소드로 통일
        predator.printFood();
    }
}
