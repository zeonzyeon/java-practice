package ch09.custom;

// 사용자 정의 예외(checked Exception)
public class BalanceInsufficientException extends Exception {
    public BalanceInsufficientException() {

    }

    public BalanceInsufficientException(String message) {
        super(message);
    }
}
