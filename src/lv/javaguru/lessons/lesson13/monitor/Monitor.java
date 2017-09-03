package lv.javaguru.lessons.lesson13.monitor;

import java.util.concurrent.TimeUnit;

public class Monitor {

    public static int i = 0;
    public static Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        Incrementer i0 = new Incrementer();
        Incrementer i1 = new Incrementer();
        new Thread(i0).start();
        new Thread(i1).start();
        while (i < 2_000_000) {
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println("i = " + i);
        System.out.println("inc0 = " + i0.count);
        System.out.println("inc1 = " + i1.count);
    }

    public static void increment() {
        // some logic
        synchronized (lock) {
            i++;
        }
    }

    public static class Incrementer implements Runnable {

        int count;

        @Override
        public void run() {
            while (i < 2_000_000) {
                increment();
                count++;
            }
        }
    }
}
