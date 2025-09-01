package tnsjavabasicsprograms;
class AccessExample {
    // Fields with different access levels
    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30; // package-private (no keyword)
    private int privateVar = 40;

    // Method to access all fields inside the same class
    public void showAll() {
        System.out.println("Inside AccessExample class:");
        System.out.println("Public: " + publicVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Default: " + defaultVar);
        System.out.println("Private: " + privateVar);
    }
}

class SubClassExample extends AccessExample {
    public void showInSubclass() {
        System.out.println("\nInside SubClassExample (subclass):");
        System.out.println("Public: " + publicVar);     // ✅ Accessible
        System.out.println("Protected: " + protectedVar); // ✅ Accessible
        System.out.println("Default: Cannot access (different class)");
        // System.out.println(defaultVar); // ❌ Error if uncommented
        System.out.println("Private: Cannot access (different class)");
        // System.out.println(privateVar); // ❌ Error if uncommented
    }
}

public class AccessDemo {
    public static void main(String[] args) {
        // Access within the same class
        AccessExample obj = new AccessExample();
        obj.showAll();

        // Access through subclass
        SubClassExample subObj = new SubClassExample();
        subObj.showInSubclass();

        // Access from non-subclass
        System.out.println("\nInside AccessDemo (non-subclass):");
        System.out.println("Public: " + obj.publicVar);      // ✅ Accessible
        System.out.println("Protected: " + obj.protectedVar); // ✅ Accessible (same package)
        System.out.println("Default: " + obj.defaultVar);     // ✅ Accessible (same package)
        System.out.println("Private: Cannot access (different class)");
        // System.out.println(obj.privateVar); // ❌ Error if uncommented
    }
}
