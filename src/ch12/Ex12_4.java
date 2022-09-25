package ch12;

import java.util.ArrayList;

// 1. 오류: 1,2,3 | 경고:?
// 2. 2,3,4
// 3. 4,7
public class Ex12_4 {
//    public static ArrayList<? extends Product> merge(ArrayList<? extends Product> list, ArrayList<? extends Product> list2) {
//        ArrayList<? extends Product> newList = new ArrayList<>(list);
//
//        newList.addAll(list2);
//
//        return newList;
//    }
    public static <T extends Product> ArrayList<T> merge(ArrayList<T> list, ArrayList<T> list2) {
        ArrayList<T> newList = new ArrayList<>(list);

        newList.addAll(list2);

        return newList;
    }

}
