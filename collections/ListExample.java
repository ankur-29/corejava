/**
 List Interface
 - Allows duplicates
 - Maintains insertion order
 - Common implementations: ArrayList, LinkedList, Vector
 - Common methods: add(), get(), remove(), size()
 - ArrayList: Fast random access, slower insertions/deletions
 - LinkedList: Fast insertions/deletions, slower random access
 - Vector: Synchronized (thread-safe), slower than ArrayList
 - List can contain null values
 - List is an ordered collection (sequence)
 - List allows positional access and insertion of elements
 - List can be used to implement stacks, queues, and other data structures
*/

package collections;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {

        // List allows duplicates & maintains order
        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("javascript");
        list.add("Java"); // duplicate allowed

        System.out.println("List: " + list);

        // Access element
        System.out.println("First element: " + list.get(0));

        // Iterate
        for (String lang : list) {
            System.out.println(lang);
        }
    }
}