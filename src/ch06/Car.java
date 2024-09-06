package ch06;

public class Car {  // convention: 첫글자 대문자, 카멜케이스
    // 필드
    String company;
    String model;
    int maxSpeed;

    // 디폴트 생성자: 입력인수를 받지 않는 생성자
    Car() {
        System.out.println("Car 클래스의 생성자 호출");
        company = "현대자동차"; // 생성자를 이용해 변수 초기화
    }

    // 입력을 받는 생성자
    Car(String company) {
        this.company = company;
    }

    // 생성자 오버로딩
    Car(String company, String model) {
        this.company = company;
        this.model = model;
    }

    Car(String company, String moel, int maxSpeed) {
        this.company = company;
        this.model = moel;
        this.maxSpeed = maxSpeed;
    }

    void setModel(String model) {
        this.model = model;
    }

    // maxSpeed 값을 넣어주는 메소드
    void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // toString() override
    String printField() {
        return company + " " + model + " " + maxSpeed;
    }

    double divide(int x, int y) {
        if (x / y == 4.5) {
            return x / y;
        }
        return 56.7; // if 조건절 외의 return else와 같은 의미?
    }

    public static void main(String[] args) {
        Car car = new Car(); // Car 클래스 객체 생성 -> 생성자 호출
        System.out.println(car.company);

        Car car2 = new Car("기아자동차");
        System.out.println(car2.company);

        Car car3 = new Car("현대자동차", "sonata", 300);
//        System.out.println(car3.company);
//        System.out.println(car3.model);
//        System.out.println(car3.maxSpeed);
        System.out.println(car3.printField());

        Car car4 = new Car("페라리", "ferrari", 400);
        System.out.println(car4.printField());

//        int value = car4.setMaxSpeed(); // void 타입 -> 반환값 X -> 호출만
        car4.setMaxSpeed(500);
        System.out.println(car4.printField());
    }
}
