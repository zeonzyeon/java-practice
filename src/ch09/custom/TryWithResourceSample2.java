package ch09.custom;
import java.io.IOException;

public class TryWithResourceSample2 {
    public static void main(String[] args) {
        try (FileStream stream = new FileStream("file1.txt")) {
            stream.read();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("완료");
        }
    }

}
