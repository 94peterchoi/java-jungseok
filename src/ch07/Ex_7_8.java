package ch07;


class Outer3 {
    int value = 10;

    class Inner {
        int value = 20;
        void method1() {
            int value = 30;

            System.out.println(value);   // 30
            System.out.println(this.value);   // 20
            System.out.println(Outer3.this.value);  // 10
            System.out.println(new Outer3().value);   // 10
        }
    }   // Inner 클래스의 끝
}   // Outer 클래스의 끝

public class Ex_7_8 {
    public static void main(String[] args) {

        Outer3 out = new Outer3();
        Outer3.Inner inner = out.new Inner();
        inner.method1();
    }
}
