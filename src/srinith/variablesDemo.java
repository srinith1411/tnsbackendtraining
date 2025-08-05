package srinith;

public class variablesDemo {
    String name; // INSTANCE VARIABLE
    static String collegeName = "KPRIT"; // STATIC VARIABLE

    void display() {
        name = "srinith";  // or this.name = "srinith";
        System.out.println("DATA IN INSTANCE VARIABLE: " + name);
        System.out.println("DATA IN STATIC VARIABLE: " + variablesDemo.collegeName);
    }
}

class variablesDemoMain {
    public static void main(String[] args) {
        variablesDemo ob = new variablesDemo();
        int a = 10;  // LOCAL VARIABLE
        System.out.println("DATA IN LOCAL VARIABLE: " + a);
        ob.display();
    }
}
