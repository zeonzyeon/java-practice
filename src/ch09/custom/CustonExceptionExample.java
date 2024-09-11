package ch09.custom;

public class CustonExceptionExample {

    void method() throws BalanceInsufficientException {
        // 예외 수동으로 발생시키기 (throw new)
        throw new BalanceInsufficientException("잔고 부족 에러 메시지");

    }

}
