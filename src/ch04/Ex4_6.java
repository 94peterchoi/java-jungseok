package ch04;

public class Ex4_6 {
    // 두 주사위 합 6이 되는 모든 경우의 수 출력
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                int sum = i + j;
                if (sum == 6)
                    System.out.printf("(%d, %d)\n", i, j);
            }
        }


        // 모범답안
        System.out.println();
        for(int i=1;i<=6;i++)
            for(int j=1;j<=6;j++)
                if(i+j==6)
                    System.out.println(i+"+"+j+"="+(i+j));
    }
}
