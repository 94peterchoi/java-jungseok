package ch12;

public class Page469 {
    public static void main(String[] args) {
        Object[] objects = new String[1];
        objects[0] = 1;


    }

}

class Box<T> {

    Box<?> box = new Box<Object>();
    Object[] objects = new String[1];

}

