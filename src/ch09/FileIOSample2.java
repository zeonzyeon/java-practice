package ch09;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIOSample2 {
    public static void main(String[] args) {
        FileIOSample2 fileIOSample2 = new FileIOSample2();
        fileIOSample2.readFile();
    }

    // 지금 당장 예외처리를 함 or 예외처리를 호출측으로 넘김
    public void readFile() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(""));
            System.out.println(reader.readLine());
            reader.close();
        } catch (Exception e) {
            // 예외 처리 코드
        }
    }
}