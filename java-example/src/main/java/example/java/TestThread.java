package example.java;

public class TestThread {
    public TestThread() {
    }

    public void TestThread() {

    }

    public static void main(String[] args) {

        SimpleDemo s = new SimpleDemo();
        s.start();

    }
}

class SimpleDemo implements Runnable {


    @Override
    public void run() {
        System.out.println("run");
    }

    public void start() {
        System.out.println("start");
    }
}
