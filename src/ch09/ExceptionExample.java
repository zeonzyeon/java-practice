package ch09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionExample {
    public static void main(String[] args) throws IOException {
        int b = Integer.parseInt(args[0]);

        int result = 10/b;  // 예외 발생 가능성이 있는 코드
        // -> 명시적으로 예외처리를 하지 않는
        // (존재하는) 파일에 데이터 읽어오는 코드 (예외상황 가정해서 예외처리를 해라 - 강제화)
        BufferedReader reader = new BufferedReader(new FileReader("파일명"));
        reader.readLine();
        reader.close();

    }
}
