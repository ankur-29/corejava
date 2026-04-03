/** 
 Map Interface
 - Stores key-value pairs
 - Keys are unique, values can be duplicates
 - Common implementations: HashMap, TreeMap, Hashtable
 - Common methods: put(), get(), remove(), size()
 - HashMap: Fast access, no ordering guarantee
 - TreeMap: Sorted by keys
 - Hashtable: Synchronized (thread-safe), slower than HashMap
*/

package collections;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {

        // HashMap (Unordered, allows one null key)
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "C++");
        hashMap.put(1, "Java");
        hashMap.put(2, "Python");
        hashMap.put(null, "NullKey"); // allowed

        System.out.println("HashMap: " + hashMap);

        // LinkedHashMap (Maintains insertion order)
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3, "C++");
        linkedHashMap.put(1, "Java");
        linkedHashMap.put(2, "Python");

        System.out.println("LinkedHashMap: " + linkedHashMap);

        // TreeMap (Sorted by keys)
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "C++");
        treeMap.put(1, "Java");
        treeMap.put(2, "Python");

        System.out.println("TreeMap: " + treeMap);

        // Hashtable (Synchronized, no null key/value)
        Map<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(3, "C++");
        hashtable.put(1, "Java");
        hashtable.put(2, "Python");

        // hashtable.put(null, "Test"); ❌ Not allowed

        System.out.println("Hashtable: " + hashtable);


        // Iterating over HashMap
        System.out.println("\nIterating HashMap:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}