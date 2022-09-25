package ch12;

public class MyCollectionGenericsRawType {
    static class SimpleCollection<T> {
        private final Object[] data = new Object[100];
        private int HEAD = 0;

        void add(T object) {
            data[HEAD] = object;
            HEAD++;
        }

        T get(int index) {
            return (T)data[index];
        }
    }

    public static void main(String[] args) {
        SimpleCollection collection = new SimpleCollection();
        collection.add("hi");
        collection.add("guys");

        String hi = (String) collection.get(0);
        String guys = (String) collection.get(1);

        System.out.printf("%s %s", hi, guys);
    }
}
