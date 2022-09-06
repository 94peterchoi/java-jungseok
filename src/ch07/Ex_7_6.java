package ch07;

class Outer {
    class Inner {
        int iv = 150;
    }
}

public class Ex_7_6 {
    public static void main(String[] args) {
        // Outer 클래스의 내부 크래스 inner의 멤버변수 iv의 값을 출력하라.
        Outer out = new Outer();
        Outer.Inner in =  out.new Inner();
        System.out.println(in.iv);
    }
}



