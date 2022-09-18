package ch11;

import java.util.Arrays;

public class Page416 {
    public static void main(String[] args) {
        String[] strArr1 = {""};
        String[] strArr2 = {""};
        System.out.println("여기는 트루 => " + Arrays.equals(strArr1, strArr2));

        Object a = strArr1;
        Object b = strArr2;

        System.out.println("배열끼리 비교 => " + strArr1.equals(strArr2));
        System.out.println("옵젝에 담아 비교 => " + a.equals(b));

        a = "abc";
        b = "abc";

        System.out.println(a.equals(b));


    }
}
