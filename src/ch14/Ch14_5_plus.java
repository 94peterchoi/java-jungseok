package ch14;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ch14_5_plus {
    public static void main(String[] args) {
        String[] strArr = {"aaa", "bb", "c", "dddd"};

        /* map to int */
//        Stream<String> stringStream = Arrays.stream(strArr);
//        int sum = stringStream.mapToInt(String::length).sum();
//        System.out.println(sum);


        /* reduce */
        Stream<String> stringStream = Arrays.stream(strArr);
        int sum = stringStream.map((s) -> s.length()).reduce(0, (a, b) -> a + b);
        System.out.println(sum);

    }
}
