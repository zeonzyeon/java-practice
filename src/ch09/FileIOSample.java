package ch09;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIOSample {
    public static void main(String[] args) {
        // 파일 내용 읽어오는 코드
        int b = Integer.parseInt(args[0]);
        String file = System.getProperty("user.dir");
        String filename = file + "/file1.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            int result = 5 / b; // ArithmeticException 발생 가능
            System.out.println(result);
//            String path = FileIOSample.class.getResource("").getPath();
//            System.out.println("path = " + path);
            System.out.println(reader.readLine());
            // reader.close();
        } catch (FileNotFoundException | ArithmeticException e) {
            System.out.println("FileNotFoundException 발생");
        } catch (IOException e) {
            System.out.println("IOException 발생");
        } finally {
            try {
                // reader.close();
            } catch (Exception e) {
                // reader 자원 닫으면서 예외 발생했을 때
            }
            // System.out.println("bye");
        }
    }
}
