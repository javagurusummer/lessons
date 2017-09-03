package lv.javaguru.lessons.lesson13.schedullers;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedullerMain {

    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleAtFixedRate(new Task(), 0, 1, TimeUnit.SECONDS);
        System.out.println(Thread.currentThread().getId());
    }

    public static class Task implements Runnable {

        @Override
        public void run() {
            System.out.println("scheduled task execution : " + Thread.currentThread().getId());
            throw new RuntimeException();
        }

    }

}
