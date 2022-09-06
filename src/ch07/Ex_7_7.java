package ch07;

class Outer2 {
    static int sNum = 2;
    static class Inner {
        static int siv = 200;
        int iv = 100;

    }
}


public class Ex_7_7 {
    public static void main(String[] args) {
        System.out.println(Outer2.sNum);


        // Outer2 클래스의 내부 클래스 Inner의 멤버변수 iv의 값을 출력
        Outer2.Inner in = new Outer2.Inner();
        System.out.println(in.iv);


        System.out.println(Outer2.Inner.siv);

    }
}
