package ch04;

import java.util.Locale;

public class Ex4_7 {
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println("ch값 " + (int)ch);

            sum += ch - 48;
        }
        System.out.println("sum = " + sum);
    }
}
