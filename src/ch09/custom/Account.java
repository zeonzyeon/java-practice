package ch09.custom;

// 은행 계좌 클래스
public class Account {
    long balance;

    Account(long balance) {
        this.balance = balance;
    }

    void deposit(long money) {
        this.balance += money;
    }

    void withdraw(long money) throws BalanceInsufficientException {
        if (balance < money) { // 출금 불가!
            throw new BalanceInsufficientException("잔액이 부족합니다. 남은금액: " + balance);
        }
        balance -= money;
    }

    void withdrawRollback(long money) {
        this.balance -= money;
        System.out.println(money + "원이 롤백되었습니다.");
    }
}
