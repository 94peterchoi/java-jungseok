package ch04;

public class Ex4_9 {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;

        // 자릿수 어떻게 구해 .. 굳이 자릿수를 구해야하나요?
        while (num != 0) {
            int val = num % 10;
            sum += val;
            num = num / 10;
        }

        System.out.println(sum);

    }
}
