package tnsjavaCollectionsFramework;
import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        
        // -------------------------
        // 1. HashMap (No order)
        // -------------------------
        System.out.println("---- HashMap Example ----");
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "Banana");
        hashMap.put(1, "Apple");
        hashMap.put(2, "Mango");
        hashMap.put(4, "Orange");
        
        System.out.println("HashMap elements (unordered): " + hashMap);
        
        // Access by key
        System.out.println("Value for key 2: " + hashMap.get(2));
        
        // Iterating
        System.out.println("Iterating HashMap:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        
        
        // -------------------------
        // 2. LinkedHashMap (Insertion order preserved)
        // -------------------------
        System.out.println("\n---- LinkedHashMap Example ----");
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3, "Banana");
        linkedHashMap.put(1, "Apple");
        linkedHashMap.put(2, "Mango");
        linkedHashMap.put(4, "Orange");
        
        System.out.println("LinkedHashMap elements (insertion order): " + linkedHashMap);
        
        
        // -------------------------
        // 3. TreeMap (Sorted by key)
        // -------------------------
        System.out.println("\n---- TreeMap Example ----");
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Banana");
        treeMap.put(1, "Apple");
        treeMap.put(2, "Mango");
        treeMap.put(4, "Orange");
        
        System.out.println("TreeMap elements (sorted by keys): " + treeMap);
        
        
        // -------------------------
        // 4. Hashtable (Thread-safe but legacy)
        // -------------------------
        System.out.println("\n---- Hashtable Example ----");
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(3, "Banana");
        hashtable.put(1, "Apple");
        hashtable.put(2, "Mango");
        hashtable.put(4, "Orange");
        
        System.out.println("Hashtable elements (unordered, synchronized): " + hashtable);
    }
}
