package lv.javaguru.lessons.lesson13.threads;

import java.util.concurrent.TimeUnit;

public class ThreadsMain {

    public static int i = 0;

    public static void main(String[] args) throws InterruptedException {
        IIncrementer iIncrementer0 = new IIncrementer();
        IIncrementer iIncrementer1 = new IIncrementer();
        Thread thread0 = new Thread(iIncrementer0);
        Thread thread1 = new Thread(iIncrementer1);
//        thread0.setDaemon(true);
//        thread1.setDaemon(true);
        thread0.start();
        thread1.start();
        while (i < 2_000_000) {
            TimeUnit.MILLISECONDS.sleep(5);
        }
        System.out.println("incrementer 0 = " + iIncrementer0.count);
        System.out.println("incrementer 1 = " + iIncrementer1.count);
        System.out.println("i = " + i);
    }

    public static synchronized void incrementI() {
        i++;
    }

    public static class IIncrementer implements Runnable {

        private int count;

        @Override
        public void run() {
            while (true) {
                i++;
                count++;
            }
        }
    }

}
