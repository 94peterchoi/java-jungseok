package ch11;

import java.util.HashSet;
import java.util.Set;

// Set 인터페이스
public class Page392 {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(2);
        set.add(3);
        set.add(1);
        set.add(55);


        Object[] objArr = new Object[3];

        set.toArray(objArr);

        System.out.println("호우");



    }
}
