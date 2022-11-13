package ch13.p530;

public class Ex13_8 {
    public static void main(String[] args) {
        T1 th1 = new T1();
        T2 th2 = new T2();

        th1.start();
        th2.start();

        try {
            th1.sleep(2000);
        } catch (InterruptedException e) {}

        System.out.println("main 종료>>");
    }
}


class T1 extends Thread {
    @Override
    public void run() {
        for (int i=0; i<300; i++) {
            System.out.print("-");
        }
        System.out.println("T1 종료>>");
    }
}

class T2 extends Thread {
    @Override
    public void run() {
        for (int i=0; i<300; i++) {
            System.out.print("|");
        }
        System.out.println("T2 종료>>");
    }
}