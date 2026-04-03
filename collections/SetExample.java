/**
  Set Interface
  - No duplicates allowed
  - Unordered (HashSet), Insertion order (LinkedHashSet), Sorted order (TreeSet)
  - Common methods: add(), remove(), contains(), size()
  - TreeSet cannot contain null (throws NullPointerException)
*/

package collections;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {

        // HashSet (Unordered, No duplicates)
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Java");
        hashSet.add("Python");
        hashSet.add("Java"); // duplicate ignored

        System.out.println("HashSet: " + hashSet);


        // LinkedHashSet (Maintains insertion order)
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Java");
        linkedHashSet.add("Python");
        linkedHashSet.add("Java"); // duplicate ignored

        System.out.println("LinkedHashSet: " + linkedHashSet);


        // 3. TreeSet (Sorted order)
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Java");
        treeSet.add("Python");
        treeSet.add("C++");
        treeSet.add("Java"); // duplicate ignored

        System.out.println("TreeSet: " + treeSet);


        // TreeSet with numbers
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(50);
        numbers.add(10);
        numbers.add(30);

        System.out.println("TreeSet (Sorted Numbers): " + numbers);
    }
}