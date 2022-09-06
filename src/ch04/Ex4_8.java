package ch04;

public class Ex4_8 {
    public static void main(String[] args) {
//        int value = (int)Math.random() * 5 + 1 ;

        for (int i =0 ; i < 50; i++) {
            int value =  (int)(Math.random() * 5 + 1) ;
            System.out.println(value);
        }

        // 모범답안
        int val = (int)(Math.random() * 6) + 1;

    }
}
