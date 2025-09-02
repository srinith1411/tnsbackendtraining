package tnsjavaCollectionsFramework;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Grapes");

        System.out.println("Fruits List: " + fruits);

        // Access element
        System.out.println("First Fruit: " + fruits.get(0));

        // Modify element
        fruits.set(1, "Strawberry");
        System.out.println("After Update: " + fruits);

        // Remove element
        fruits.remove("Mango");
        System.out.println("After Removing Mango: " + fruits);

        // Check if list contains a value
        System.out.println("Contains Apple? " + fruits.contains("Apple"));

        // Size of list
        System.out.println("Size of List: " + fruits.size());

        // Iterate using for-each loop
        System.out.println("\nIterating through list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
