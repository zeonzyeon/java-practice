package ch02;

public class DailyQuiz {
    public static void main(String[] args) {
        // 다음 문장들의 출력 결과를 확인해보세요.
        System.out.println("10" + "04"); // 1004
        System.out.println("" + false); // false
        System.out.println('a' + 100); // 197

        // 에러가 발생하는 부분을 고쳐보세요.
        short a = 999;
        char b = 'a';
        double c = 1.23d;

        // 다음 중 변수를 잘못 초기화한 것을 모두 고르세요.
        int aa = 1;
//        char bb = '';
//        char cc = 'hello';
//        byte dd = 12345;

        // 아래 코드는 변수 x, y, z의 값을 서로 바꾸는 예제입니다. 실행 결과처럼 출력되도록 빈칸에 알맞은 코드를 넣어주세요.
        int x = 1;
        int y = 20;
        int z = 300;

        // 코드를 작성해주세요
        int tmp = y;
        y = z;
        z = x;
        x = tmp;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
}
