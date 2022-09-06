package ch14;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ch14_7_Lotto {
    public static void main(String[] args) {

        Stream<Integer> lotto = IntStream.rangeClosed(1, 45).boxed();
//        lotto.limit(6).forEach(System.out::println);


//        ArrayList numArr = new ArrayList();
//
//        for (int i = 0; i < 6; i++) {
//            int ranNum = (int) (Math.random() * 45);
//            numArr.add(ranNum);
//        }
//
//        Stream<Integer> intStream = numArr.stream();
//        intStream.sorted().forEach(System.out::println);

        /* 이러면 계속 무한스트림 돌아버림 */
//        IntStream intStream = new Random().ints(1, 46).distinct().sorted();
//        intStream.limit(6).forEach(System.out::println);

        IntStream intStream = new Random().ints(1, 46).distinct().limit(6).sorted();
        intStream.forEach(System.out::println);

        Object obj[] = {1,2, "STR"};
        System.out.println(obj[2]);



        Object obj2 = 1.7f;
        Integer i = (Integer)obj2;






    }
}
