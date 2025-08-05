package srinith;

class operatorsDemo {
    // you can put operator-related methods here if needed
}

public class operatorsDemoMain {
    public static void main(String[] args) {
        // UNARY OPERATORS DEMO

        // POST-INCREMENT OPERATOR
        int a = 5;
        int c = a++; // c = 5, a becomes 6
        System.out.println("Post-increment: c = " + c + ", a = " + a);     

        // PRE-INCREMENT OPERATOR(USED IN FOR LOOP)
        int b = 5;
        int d = ++b; // b becomes 6, d = 6
        System.out.println("Pre-increment: d = " + d + ", b = " + b);         
    }
}
