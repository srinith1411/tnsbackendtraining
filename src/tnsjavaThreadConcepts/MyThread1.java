package tnsjavaThreadConcepts;
class SharedResource {
    // Synchronized method
    public synchronized void printNumbers(String threadName) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " prints: " + i);
            try {
                Thread.sleep(500); // delay for visibility
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
            }
        }
    }
}

class MyThread1 extends Thread {
    SharedResource resource;
    String threadName;

    MyThread1(SharedResource resource, String threadName) {
        this.resource = resource;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        resource.printNumbers(threadName);
    }

    public static void main(String[] args) {
        SharedResource obj = new SharedResource();

        MyThread1 t1 = new MyThread1(obj, "Thread-1");
        MyThread1 t2 = new MyThread1(obj, "Thread-2");

        t1.start();
        t2.start();
    }
}
