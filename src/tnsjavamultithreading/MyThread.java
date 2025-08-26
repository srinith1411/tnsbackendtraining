package tnsjavamultithreading;


class MyThreadUsingThreadClass extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread running: " + i);
            try {
                Thread.sleep(500); // pause for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted!");
            }
        }
    }

    public static void main(String[] args) {
        MyThreadUsingThreadClass t1 = new MyThreadUsingThreadClass();
        t1.start();  // start the thread

        // Main thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted!");
            }
        }
    }
}


