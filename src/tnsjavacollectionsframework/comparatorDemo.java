package tnsjavaCollectionsFramework;

// Comparator demo in Java
// Example: Sorting Student objects by name OR roll number

import java.util.*;

class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return rollNo + " - " + name;
    }
}

// Comparator for sorting by roll number
class RollNoComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.rollNo - s2.rollNo;
    }
}

// Comparator for sorting by name
class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class comparatorDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        
        students.add(new Student(3, "Arjun"));
        students.add(new Student(1, "Riya"));
        students.add(new Student(2, "Kiran"));

        System.out.println("Original List:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sort by roll number
        Collections.sort(students, new RollNoComparator());
        System.out.println("\nSorted by Roll Number:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sort by name
        Collections.sort(students, new NameComparator());
        System.out.println("\nSorted by Name:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
