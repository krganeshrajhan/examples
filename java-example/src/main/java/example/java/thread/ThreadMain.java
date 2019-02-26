package example.java.thread;

public class ThreadMain {

    public static void main(String[] args) {

        Thread.currentThread().setName("Main Thread");
        System.out.println(Thread.currentThread().getName());
        Thread t1 = new Thread(new MyThread());
        Thread t2 = new Thread(new YieldThread());

        t1.setName("New Thread");
        t2.setName("Yield Thread");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End of Main Thread");
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

class YieldThread implements Runnable {

    @Override
    public void run() {

        for(int i=0;i<10;i++) {

            System.out.println(Thread.currentThread().getName() + " " + i);

            if(i==5) {

                Thread.yield();
            }
        }
        System.out.println("End of Yield Thread");
    }
}
