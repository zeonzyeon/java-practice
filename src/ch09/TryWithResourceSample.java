package ch09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceSample {
    public static void main(String[] args) {
        // file 읽어오는 로직
        String filename = "file1.txt";
        // interface AutoClosable close() 구현
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            reader.readLine();
            reader.close();
        } catch (IOException e) {
            System.out.println("IOException 발생");
        }
    }
}
