package tnsjavamultithreading;

public class ReaderWriter {
public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread writerThread = new Thread(new Writer(resource));
        Thread readerThread = new Thread(new Reader(resource));

        writerThread.start();
        readerThread.start();
    }
}


