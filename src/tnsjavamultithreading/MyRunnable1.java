package tnsjavamultithreading;

class SharedResource1  {
    // synchronized method to prevent concurrent access
    public synchronized void printTable(int num) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class MyRunnable1 implements Runnable {
    SharedResource1 resource;
    int number;

    // constructor
    MyRunnable1(SharedResource1 resource, int number) {
        this.resource = resource;
        this.number = number;
    }

    @Override
    public void run() {
        resource.printTable(number);
    }

    // main method inside MyRunnable1
    public static void main(String[] args) {
        SharedResource1 obj = new SharedResource1();

        Thread t1 = new Thread(new MyRunnable1(obj, 2));
        Thread t2 = new Thread(new MyRunnable1(obj, 5));

        t1.start();
        t2.start();
    }
}
