package tnsjavaCollectionsFramework;

// Comparable demo in Java
// Example: Sorting Student objects by roll number (natural ordering)

import java.util.*;

class Student implements Comparable<Student> {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Natural ordering: compare by roll number
    @Override
    public int compareTo(Student other) {
        // return positive if this > other, negative if this < other
        return this.rollNo - other.rollNo;
    }

    @Override
    public String toString() {
        return rollNo + " - " + name;
    }
}

public class comparableDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        
        students.add(new Student(3, "Arjun"));
        students.add(new Student(1, "Riya"));
        students.add(new Student(2, "Kiran"));

        System.out.println("Before sorting:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Uses Comparable (natural order)
        Collections.sort(students);

        System.out.println("\nAfter sorting by roll number:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
