/** 
 Comparable Interface
 - Used to define the natural ordering of objects
 - Implements compareTo() method
 - Common use case: sorting lists of custom objects
*/

package collections;

import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Sorting by id
    public int compareTo(Student s) {
        return this.id - s.id;
    }
}

public class ComparableExample {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student(3, "Ankur"));
        list.add(new Student(1, "Rahul"));
        list.add(new Student(2, "Amit"));

        Collections.sort(list);

        for (Student s : list) {
            System.out.println(s.id + " " + s.name);
        }
    }
}