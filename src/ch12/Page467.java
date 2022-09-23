package ch12;

import java.util.ArrayList;

public class Page467 {
    public static void main(String[] args) {

    }
}


/* 컴파일 에러 */
//class Fruit<> extends Box<T> {
//
//}


class Fruit<T> extends Box<T> {

}


class Box<T> {

    ArrayList<T> list = new ArrayList<>();

    void add(T item) {
        list.add(item);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}