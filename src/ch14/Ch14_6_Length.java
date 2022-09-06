package ch14;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class Ch14_6_Length {
    public static void main(String[] args) {
        // 문자열 중 가장 긴 거 출력

        /* max() 메서드 이용 */
        String[] strArr = {"aaa", "bb", "c", "dddddddd"};
        Stream<String> strStream = Arrays.stream(strArr);
        OptionalInt optMax =  strStream.mapToInt(String::length).max();
        System.out.println(optMax.orElse(0));


        /* reduce 이용 */
//        int max = 0;
//        String[] strArr = {"aaa", "bb", "c", "ddddd"};
//        Stream<String> strStream = Arrays.stream(strArr);
//        int max = strStream.map(String::length).reduce(0, (a, b) -> {
//            if (a <= b) {
//                return b;
//            } else {
//                return a;
//            }
//        });
//
//        System.out.println("max = " + max);

    }
}
