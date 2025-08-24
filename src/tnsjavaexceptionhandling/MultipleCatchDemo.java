package tnsjavaexceptionhandling;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            arr[5] = 50;  // ArrayIndexOutOfBoundsException
            int num = Integer.parseInt("abc"); // NumberFormatException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of range!");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format!");
        } catch (Exception e) {
            System.out.println("General Error: " + e.getMessage());
        }
    }
}
