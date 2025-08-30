package tnsjavamultithreading;

public class Writer  implements Runnable {
    private final SharedResource resource;

    public Writer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        int value = 1;
        try {
            while (true) {
                resource.write(value++);
                Thread.sleep(500);  // simulate time to write
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}