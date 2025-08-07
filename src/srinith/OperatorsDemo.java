package srinith;
public class OperatorsDemo {
}
class OperatorsDemoMain {
    public static void main(String[] args) {
        
        int a = 10, b = 5;

        // 1. Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));  // Addition
        System.out.println("a - b = " + (a - b));  // Subtraction
        System.out.println("a * b = " + (a * b));  // Multiplication
        System.out.println("a / b = " + (a / b));  // Division
        System.out.println("a % b = " + (a % b));  // Modulus
        System.out.println();

        // 2. Relational (Comparison) Operators
        System.out.println("Relational Operators:");
        System.out.println("a == b: " + (a == b));  // Equal to
        System.out.println("a != b: " + (a != b));  // Not equal to
        System.out.println("a > b: " + (a > b));    // Greater than
        System.out.println("a < b: " + (a < b));    // Less than
        System.out.println("a >= b: " + (a >= b));  // Greater than or equal to
        System.out.println("a <= b: " + (a <= b));  // Less than or equal to
        System.out.println();

        // 3. Logical Operators
        System.out.println("Logical Operators:");
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y));  // Logical AND
        System.out.println("x || y: " + (x || y));  // Logical OR
        System.out.println("!x: " + (!x));          // Logical NOT
        System.out.println();

        // 4. Assignment Operators
        System.out.println("Assignment Operators:");
        int c = a;              // = operator
        c += b;                 // c = c + b
        System.out.println("c += b: " + c);
        c *= 2;                 // c = c * 2
        System.out.println("c *= 2: " + c);
        System.out.println();

        // 5. Unary Operators
        System.out.println("Unary Operators:");
        int d = 5;
        System.out.println("d = " + d);
        System.out.println("++d = " + (++d));  // Pre-increment
        System.out.println("d++ = " + (d++));  // Post-increment
        System.out.println("d = " + d);        // Value after post-increment
        System.out.println("--d = " + (--d));  // Pre-decrement
        System.out.println("d-- = " + (d--));  // Post-decrement
        System.out.println("d = " + d);        // Value after post-decrement
        System.out.println();

        // 6. Bitwise Operators
        System.out.println("Bitwise Operators:");
        int e = 6, f = 3;
        System.out.println("e & f: " + (e & f));  // Bitwise AND
        System.out.println("e | f: " + (e | f));  // Bitwise OR
        System.out.println("e ^ f: " + (e ^ f));  // Bitwise XOR
        System.out.println("~e: " + (~e));        // Bitwise NOT
        System.out.println("e << 1: " + (e << 1)); // Left shift
        System.out.println("e >> 1: " + (e >> 1)); // Right shift
    }
}
