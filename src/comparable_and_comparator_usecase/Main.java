package comparable_and_comparator_usecase;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Aritra", 85));
        students.add(new Student("Fuchun", 92));
        students.add(new Student("Brijesh", 78));
        students.add(new Student("Deb", 85));

        System.out.println("Original List:");
        students.forEach(System.out::println);

        // Sort using Comparable (by name)
        Collections.sort(students);
        System.out.println("\nSorted by Name:");
        students.forEach(System.out::println);

        // Sort using Comparator (by marks descending)
        students.sort(new MarksComparator());
        System.out.println("\nSorted by Marks (Descending):");
        students.forEach(System.out::println);
    }
}
