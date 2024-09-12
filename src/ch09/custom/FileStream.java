package ch09.custom;

import java.io.IOException;

public class FileStream implements AutoCloseable{
    private String fileName;

    FileStream(String fileName) {
        this.fileName = fileName;
    }

    void read() throws Exception {
        System.out.println("FileStream.read() 호출 실패");
        throw new Exception("예외 발생 상황 가정");
    }

    @Override
    public void close() throws Exception {
        System.out.println("close() 메소드 호출");
    }
}
