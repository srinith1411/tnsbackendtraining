package tnsjavaexceptionhandling;

public class ThrowKeywordDemo {
    public static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible for voting");
        }
        System.out.println("Eligible for voting");
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (ArithmeticException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}
