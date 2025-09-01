package tnsjavaThreadConcepts;

public class Reader implements Runnable {
    private final SharedResource resource;

    public Reader(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        try {
            while (true) {
                resource.read();
                Thread.sleep(800);  // simulate time to read
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
