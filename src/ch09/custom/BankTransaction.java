package ch09.custom;

// 송금 트랜잭션
public class BankTransaction {
    public static void main(String[] args) {
        // A,B 계좌 생성 (상태 필드 추가)
        Account accountA = new Account(0);
        Account accountB = new Account(100000);

        System.out.println("A의 초기 잔액: " + accountA.balance+"원");
        System.out.println("B의 초기 잔액: " + accountB.balance+"원");

        // A->B 10만원 송금
        int money = 10000;
        try {
            accountB.deposit(money);
            accountA.withdraw(money);
        } catch (BalanceInsufficientException e) {
            // 만약 잔액보다 큰 금약을 송금 시도할 경우 트랜잭션 처리
            accountB.withdrawRollback(money);
        }
        System.out.println("A의 잔액: " + accountA.balance + "원");
        System.out.println("B의 잔액: " + accountB.balance + "원");
    }
}
