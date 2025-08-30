package tnsjavamultithreading;
public class SharedResource {
    private int data;             // single shared variable
    private boolean dataAvailable = false;  // flag to control access

    // Writer writes data
    public synchronized void write(int value) throws InterruptedException {
        while (dataAvailable) {  // Wait until reader reads the old data
            wait();
        }
        data = value;
        System.out.println("Writer wrote: " + value);
        dataAvailable = true;    // mark data ready for reading
        notify();                // wake up reader
    }

    // Reader reads data
    public synchronized int read() throws InterruptedException {
        while (!dataAvailable) { // Wait until writer produces new data
            wait();
        }
        System.out.println("Reader read: " + data);
        dataAvailable = false;   // mark data as consumed
        notify();                // wake up writer
        return data;
    }
}

