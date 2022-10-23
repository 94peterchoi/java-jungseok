package ch13;

public class Lecture13_8 {
    public static void main(String[] args) {
        Thread1 th1 = new Thread1();
        Thread2 th2 = new Thread2();
        
        th1.start();
        th2.start();

        ThreadGroup threadGroup1 = th1.getThreadGroup();
        ThreadGroup threadGroup2 = th2.getThreadGroup();

        System.out.println("threadGroup1 = " + threadGroup1);
        System.out.println("threadGroup2 = " + threadGroup2);

    }
}


class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i=0; i< 300; i++) {
            System.out.print("-");
        }
        System.out.println("th1 종료");
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        for (int i=0; i< 300; i++) {
            System.out.print("|");
        }
        System.out.println("th2 종료");
    }
}