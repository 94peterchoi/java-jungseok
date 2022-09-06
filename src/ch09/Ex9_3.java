package ch09;

public class Ex9_3 {
    public static int count(String src, String target) {
        int count = 0;
        int pos = 0;

        while(true) {
            int index = src.indexOf(target, pos);
            if (index == -1) {
                break;
            }
            count++;
            pos = index + target.length();
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(count("12345AB12AB345AB", "AB"));
        System.out.println(count("12345", "AB"));

    }
}
