package ch12;

import java.util.List;

public class Box2<T extends List> {
    T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
