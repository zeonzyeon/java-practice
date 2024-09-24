package ch13;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) throws IOException {
        // 1. 컬렉션으로 스트림 생성
        List<String> list = Arrays.asList("1", "2", "3", "4");
        Stream<String> stringStream = list.stream();

        // 2. 배열로 스트림 생성
        String[] array = {"1", "2", "3", "4"};
        Stream<String> stringStream2 = Arrays.stream(array);

        // 3. 숫자 범위 스트림 생성
        IntStream intStream = IntStream.range(1, 5);
        LongStream longStream = LongStream.range(1, 5);
        DoubleStream doubleStream = DoubleStream.of(1.2, 3);

        // 4. 파일을 통한 스트림 생성
        Stream<String> fileStream = Files.lines(Paths.get("file.txt"), Charset.forName("UTF-8"));
        fileStream.forEach(System.out::println);

        // 5. 스트림 연결해서 하나의 스트림 생성
        Stream<Integer> inttStrem1 = Stream.of(1, 2, 3);
        Stream<Integer> inttStrem2 = Stream.of(4, 5, 6);
        Stream<Integer> concated = Stream.concat(inttStrem1, inttStrem2);
        concated.forEach(System.out::println);

    }
}
