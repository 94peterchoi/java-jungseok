package ch09;

public class Ex9_4 {

    public static boolean contains(String src, String target) {
        return src.indexOf(target) >= 0;
    }

    public static void main(String[] args) {
        System.out.println(contains("12345", "23"));
        System.out.println(contains("12345", "67"));
    }
}
