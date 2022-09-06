package ch06;

import java.util.Arrays;

public class Ex_6_17 {

    static int[] shuffle(int[] arr) {

        int length = arr.length;

        for (int i =0; i < length; i++) {
            int random = (int)(Math.random() * length);

            int tmp = arr[0];
            arr[0] = arr[random];
            arr[random] = tmp;
        }

        return arr;

    }

    public static void main(String[] args) {
        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(Arrays.toString(result));

    }
}
