package ch13;

public class Lecture13_10 {

    public static void main(String[] args) {
        Th1 th1 = new Th1();
        Th2 th2 = new Th2();

        th1.start();
        th2.start();

        ThreadGroup threadGroup1 = th1.getThreadGroup();
        ThreadGroup threadGroup2 = Thread.currentThread().getThreadGroup();

        System.out.println("threadGroup1 = " + threadGroup1);
        System.out.println("threadGroup2 = " + threadGroup2);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {}

    }
}


class Th1 extends Thread {
    @Override
    public void run() {
        for (int i=0; i< 300; i++) {
            System.out.print("-");
        }
        System.out.println("th1 종료");
    }
}

class Th2 extends Thread {
    @Override
    public void run() {
        for (int i=0; i< 300; i++) {
            System.out.print("|");
        }
        System.out.println("th2 종료");
    }
}