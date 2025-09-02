package tnsjavaCollectionsFramework;

import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        // Using HashSet (No order, unique elements)
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Apple"); // Duplicate, won't be added

        System.out.println("HashSet (Unordered): " + hashSet);

        // Check existence
        System.out.println("Contains Mango? " + hashSet.contains("Mango"));

        // Remove element
        hashSet.remove("Banana");
        System.out.println("After Removing Banana: " + hashSet);

        // Iterate HashSet
        System.out.println("\nIterating HashSet:");
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }

        // Using TreeSet (Sorted order, unique elements)
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Mango");
        treeSet.add("Orange");

        System.out.println("\nTreeSet (Sorted): " + treeSet);

        // First and Last element
        System.out.println("First Element: " + treeSet.first());
        System.out.println("Last Element: " + treeSet.last());

        // Iterate TreeSet
        System.out.println("\nIterating TreeSet:");
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }
    }
}
