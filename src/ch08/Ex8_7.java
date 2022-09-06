package ch08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex8_7 {
    public static void main(String[] args) {

        int answer = (int) (Math.random() * 100) + 1;
        int input = 0;
        int count = 0;

        do {
            count++;
            System.out.println("1과 100 사이의 값을 입력하세용 : ");

            try {
                input = new Scanner(System.in).nextInt();
            } catch (Exception ime) {
                ime.printStackTrace();
                System.out.println("메싸지 => " + ime.getMessage());
                System.out.println("숫자를 입력하렴!");
                continue;
            }

            if (answer > input) {
                System.out.println("더 큰수를 입력해!");
            } else if (answer < input) {
                System.out.println("더 작은 수를 입력해!");
            } else {
                System.out.println("맞췄어");
                System.out.println("시도횟수는 ? " + count + "번이얌");
                break;
            }

        } while(true);
    }
}
