package ch08.payment;

public class PaymentProcess {
    public static void main(String[] args) {
        // 객체 생성 (paypal, creditcard)
        // 인터페이스 타입으로도 사용 가능
        Payment creditCar = new CreditCard("5678-2345");

        CreditCard creditCard = new CreditCard("5678-1234");
        creditCard.processPayment(67890);

        Paypal paypal = new Paypal("email@aws.com");
        paypal.processPayment(67890);
        Payment paypal2 = new Paypal("email@aws.com");
        paypal2.processPayment(67890);
    }
}
