package ch04;

public class Ex4_10 {
    public static void main(String[] args) {
        int answer = (int)(Math.random() * 100) + 1;
        int input =0;
        int count =0;

        java.util.Scanner s = new java.util.Scanner(System.in);

        do {
            count++;
            System.out.println("1과 100 사이의 값을 입력하세요");
            input = s.nextInt();

            // 탈출
            if (answer > input) {
                System.out.println("더 큰 수를 입력해주세요");
                continue;
            }
            if (answer < input) {
                System.out.println("더 작은 수를 입력해주세요");
                continue;
            }
            System.out.println("맞혔습니다");
            System.out.println("시도횟수는 " + count + "번 입니다.");
            break;

        } while(true);
    }
}
