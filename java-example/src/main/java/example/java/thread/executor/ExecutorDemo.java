package example.java.thread.executor;

import java.util.concurrent.Executor;

public class ExecutorDemo {

    public static void main(String[] args) {

        Thread.currentThread().setName("Main thread");

        Executor executor = new ThreadPerTaskExecutor();
        executor.execute(new MyThread());

        Executor singleThreadExecutor = new SingleThreadExecutor();
        singleThreadExecutor.execute(new MyThread());
    }
}

class MyThread implements Runnable {

    @Override
    public void run() {

        for(int i=0; i<10; i++) {

            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        System.out.println("End of New Thread");
    }
}

class ThreadPerTaskExecutor implements Executor {


    @Override
    public void execute(Runnable command) {

        Thread t = new Thread(command);
        t.setName("Child");
        t.start();
    }
}

class SingleThreadExecutor implements Executor {

    @Override
    public void execute(Runnable command) {

        Thread t = new Thread(command);
        t.setName("Single Thread");
        t.run();
    }
}
