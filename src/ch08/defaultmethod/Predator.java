package ch08.defaultmethod;

public interface Predator {
    String getFood();

    // 다폴트 메소드
    default void printFood(){
        System.out.printf("my food is %s\n", getFood());
    }

}
