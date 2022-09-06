package ch04;

public class Ex4_4 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (true) {

            sum += i % 2 == 0 ? -i : i;
            if (sum >= 100)
                break;
            i = i +1;
            }
        System.out.println("i값 : " + i);
    }
}
