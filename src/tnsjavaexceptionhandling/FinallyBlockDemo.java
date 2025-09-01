package tnsjavaExceptionHandling;

public class FinallyBlockDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Opening file...");
            int num = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Closing file... (finally block executed)");
        }
    }
}
