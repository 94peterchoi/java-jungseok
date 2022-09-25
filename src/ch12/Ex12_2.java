package ch12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Ex12_2 {
    static <T extends List> String makeJuice(ArrayList<T> box) {
        return "";
    }

    static void test(ArrayList<? extends String> strArr) {
        
    }

    public static void main(String[] args) {
//        Ex12_2.<Vector>makeJuice(new ArrayList<LinkedList>());
        Ex12_2.<Vector>makeJuice(new ArrayList<Vector>());
    }
}
