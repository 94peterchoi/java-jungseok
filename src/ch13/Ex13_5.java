package ch13;

public class Ex13_5 {
    static boolean stopped = false;

    public static void main(String[] args) {
        Thread5 th = new Thread5();
        th.start();

        try {
            Thread.sleep(6 * 1000);
        } catch (InterruptedException e) {}

        stopped = true;
//        Thread.interrupted();
//        th.interrupt();
        System.out.println("stopped");
    }

}


class Thread5 extends Thread {
    @Override
    public void run() {
        for (int i=0; !Ex13_5.stopped; i++) {
            System.out.println(i);

            try {
                Thread.sleep(3 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}