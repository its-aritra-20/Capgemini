package comparable_and_comparator;

import java.util.*;

public class EmployeeDriver {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Aritra", 200.0);
        Employee e2 = new Employee(2, "Honu", 300.0);

        System.out.println(e1.toString());
        System.out.println(e2.toString());

        compareBasedName(e1, e2);
        compareSalary(e1, e2);

        // Now compare by ID using Comparator
        CompareEmployeeId idComparator = new CompareEmployeeId();
        if (idComparator.compare(e1, e2) > 0) {
            System.out.println("e1 has a greater ID!");
        } else if (idComparator.compare(e1, e2) < 0) {
            System.out.println("e2 has a greater ID!");
        } else {
            System.out.println("e1 and e2 have equal IDs.");
        }
    }
    public static void compareSalary(Employee e1, Employee e2) {
        double result = e1.compareSalary(e1, e2);

        if (result > 0) {
            System.out.println(e1.name + " has a higher salary.");
        } else if (result < 0) {
            System.out.println(e2.name + " has a higher salary.");
        } else {
            System.out.println("Both employees have the same salary.");
        }
    }

    public static void compareBasedName(Employee e1, Employee e2) {
        if (e1.compareTo(e2) > 0) {
            System.out.println("e1's name is greater alphabetically!");
        } else if (e1.compareTo(e2) < 0) {
            System.out.println("e2's name is greater alphabetically!");
        } else {
            System.out.println("Both employees have the same name.");
        }
    }
    
}
