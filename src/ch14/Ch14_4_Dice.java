package ch14;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ch14_4_Dice {
    public static void main(String[] args) {

//        int[] diceArr = {1,2,3,4,5,6};
//
//        for (int i : diceArr) {
//            IntStream diceStream = Arrays.stream(diceArr);
//            diceStream.filter((number) -> number + i == 6).forEach((num) -> System.out.println(num + " " + i));
//        }


        // 2개의 주사위 ..

//        int[] diceArr = {1,2,3,4,5,6};
//        int[][] secondDimensionDice = {{1}, {2}};
//
//        IntStream diceStream = Arrays.stream(diceArr);
//
//
//        diceStream.forEach((firstNum) -> {
//            IntStream diceStream2 = Arrays.stream(diceArr);
//            diceStream2.forEach((secondNum) -> {
//                if (firstNum + secondNum == 6) {
//                    System.out.println(firstNum+ " " + secondNum);
//                }
//            });
//        });

//        System.out.println(Arrays.toString(diceArr));
//
//        System.out.println(Arrays.toString(secondDimensionDice));

        Stream<Integer> dice = IntStream.rangeClosed(1, 6).boxed();


        dice.flatMap((i) -> Stream.of(1,2,3,4,5,6).map((j) -> new int[]{i, j} ))
                .filter((intArr) -> intArr[0] + intArr[1] == 6)
                .map(Arrays::toString)
                .forEach(System.out::println);
    }
}
